package com.fxDemo.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 网格布局
 */
public class GridPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();

        Text text1 = new Text("Email");
        Text text2 = new Text("Password");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button1 = new Button("submit");
        Button button2 = new Button("reset");

        gridPane.add(text1,0,0);
        gridPane.add(textField1,1,0);
        gridPane.add(text2,0,1);
        gridPane.add(textField2,1,1);
        gridPane.add(button1,0,2);
        gridPane.add(button2,1,2);

        // 垂直间距
        gridPane.setVgap(15);
        // 水平间距
        gridPane.setHgap(5);
        // 对齐方式
        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane,400,300);
        stage.setTitle("GridPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
