package com.example.java.jfx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 边框布局
 */
public class BorderPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new TextField("Top"));
        borderPane.setLeft(new TextField("Left"));
        borderPane.setRight(new TextField("Right"));
        borderPane.setCenter(new TextField("Center"));
        borderPane.setBottom(new TextField("Bottom"));

        Scene scene = new Scene(borderPane,400,300);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
