package top.xkk.weather.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import top.xkk.weather.config.AppConstant;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ApiConnector {
    private final String urlString;

    public ApiConnector(String urlString) {
        this.urlString = urlString;
    }

    /**
     * 根据查询参数指定的url请求，返回JSON数组
     * @param query
     * @return
     */
    public JSONArray getJsonArray(String query) {
        try {
            URL url = new URL(urlString + query);
            // 向指定url发起get请求
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            // 检查连接是否正常
            if (responseCode != AppConstant.SUCCESS) {
                throw new RuntimeException("HttpResponseCode:" + responseCode);
            } else {
                // 按行读取结果
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                // 返回JSONArray
                return (JSONArray)parse.parse(String.valueOf(informationString));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject getJsonObject(String query) {
        try {
            URL url = new URL(urlString + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != AppConstant.SUCCESS) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                return (JSONObject) parse.parse(String.valueOf(informationString));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
