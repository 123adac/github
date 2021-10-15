package top.xkk.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(App.class.getResource("view/primary.fxml"));
        fxmlLoader.setLocation(App.class.getResource("view/iconDemo.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setScene(scene);
        stage.setTitle("Weather APP");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
