package top.xkk.weather.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import top.xkk.weather.util.ApiConnector;
import top.xkk.weather.util.NumberUtil;

public class PrimaryController {
    @FXML
    private TextField cityInput;

    @FXML
    private Label currentDateLabel;

    @FXML
    private Label currentCityLabel;

    @FXML
    private Label currentTemperatureLabel;

    @FXML
    private Label maxTemperatureLabel;

    @FXML
    private Label minTemperatureLabel;

    @FXML
    private Label winSpeedLabel;

    @FXML
    void getWeatherData(ActionEvent actionEvent) {
        JSONObject todayWeather = getTodayWeatherInformation(getWoeid());
        System.out.println(todayWeather);
        currentDateLabel.setText("currentDate:  " + todayWeather.get("applicable_date"));
        currentCityLabel.setText("currentCity:  " + cityInput.getText());
        currentTemperatureLabel.setText("currentTemperature:  " + NumberUtil.format(todayWeather.get("the_temp")));
        maxTemperatureLabel.setText("maxTemperature:  " + todayWeather.get("max_temp"));
        minTemperatureLabel.setText("minTemperature:  " + todayWeather.get("min_temp"));
        winSpeedLabel.setText("winSpeed:  " + NumberUtil.format(todayWeather.get("wind_speed")));
    }

    public String getWoeid() {
        String cityApi = "https://www.metaweather.com/api/location/search/?query=";
        ApiConnector apiConnectorCity = new ApiConnector(cityApi);
        JSONObject jsonDate = (JSONObject) (apiConnectorCity.getJsonArray(cityInput.getText()).get(0));
        return jsonDate.get("woeid").toString();
    }

    public JSONObject getTodayWeatherInformation(String woeid) {
        String weatherApi = "https://www.metaweather.com/api/location/";
        ApiConnector apiConnectorWeather = new ApiConnector(weatherApi);
        JSONObject weatherJsonObject = apiConnectorWeather.getJsonObject(woeid + "/");
        JSONArray weatherArray = (JSONArray) weatherJsonObject.get("consolidated_weather");
        return (JSONObject) weatherArray.get(0);
    }
}
