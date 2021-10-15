package com.example.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * VBox
 */
public class VBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Button playButton = new Button("play");
        Button stopButton = new Button("stop");

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        // 设置外边距
        VBox.setMargin(textField,new Insets(20,20,20,20));
        VBox.setMargin(playButton,new Insets(20,20,20,20));
        VBox.setMargin(stopButton,new Insets(20,20,20,20));

        // 组件放入HBox
        vBox.getChildren().addAll(textField,playButton,stopButton);

        Scene scene = new Scene(vBox,400,300);
        stage.setTitle("VBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
