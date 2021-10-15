package com.fxDemo.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * HBox
 */
public class HBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Button playButton = new Button("play");
        Button stopButton = new Button("stop");

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        // 设置外边距
        HBox.setMargin(textField,new Insets(20,20,20,20));
        HBox.setMargin(playButton,new Insets(20,20,20,20));
        HBox.setMargin(stopButton,new Insets(20,20,20,20));

        // 组件放入HBox
        hBox.getChildren().addAll(textField,playButton,stopButton);

        Scene scene = new Scene(hBox,400,300);
        stage.setTitle("HBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
