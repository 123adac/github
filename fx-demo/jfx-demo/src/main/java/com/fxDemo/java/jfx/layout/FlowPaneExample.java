package com.fxDemo.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * 流布局
 */
public class FlowPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane();

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");

        flowPane.getChildren().addAll(button1,button2,button3,button4);
        flowPane.setHgap(25);
        FlowPane.setMargin(button1,new Insets(20,0,20,20));

        Scene scene = new Scene(flowPane,400,300);
        stage.setScene(scene);
        stage.setTitle("FlowPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
