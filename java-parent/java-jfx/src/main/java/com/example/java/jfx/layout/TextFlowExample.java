package com.example.java.jfx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * 文本流布局
 */
public class TextFlowExample extends Application {
    @Override
    public void start(Stage stage) {
        TextFlow textFlow = new TextFlow();

        Text text1 = new Text("Welcome to JavaFx");
        text1.setFont(new Font(15));
        text1.setFill(Color.DARKSLATEBLUE);
        Text text2 = new Text("We provide free tutorials for readers in various technologies");
        text2.setFont(new Font(15));
        text2.setFill(Color.DARKGOLDENROD);
        Text text3 = new Text("We provide free tutorials for readers in various technologies");
        text3.setFont(new Font(15));
        text3.setFill(Color.DARKGRAY);
        Text text4 = new Text("\nWe provide free tutorials for readers in various technologies");
        text4.setFont(new Font(15));
        text4.setFill(Color.MEDIUMVIOLETRED);

        textFlow.getChildren().addAll(text1,text2,text3,text4);
        Scene scene = new Scene(textFlow,400,300);
        stage.setTitle("TextFlow");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
