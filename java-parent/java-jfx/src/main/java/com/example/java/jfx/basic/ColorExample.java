package com.example.java.jfx.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 颜色练习
 */
public class ColorExample extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(300.0f,180.0f,90.0f);
        circle.setFill(Color.LIGHTGREY);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.LIGHTBLUE);

        Text text = new Text("This is a colored circle");
        text.setFont(Font.font(30));
        text.setFill(Color.BEIGE);
        text.setX(155);
        text.setY(50);
        text.setStroke(Color.DARKSLATEBLUE);
        text.setStrokeWidth(2);

        Group group = new Group(circle,text);

        Scene scene = new Scene(group,600,400);
        stage.setScene(scene);
        stage.setTitle("Color Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
