package com.example.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class demoTxspCtrl implements Initializable {

    @FXML
    public TextField tfSearch;

    @FXML
    public Button btnSearch;

    public void tfAction(ActionEvent actionEvent) {
    }

    public void tfMouseMoved(MouseEvent mouseEvent) {
        btnSearch.setStyle(
                "-fx-background-color: #E9593A;"
                        + "-fx-border-width: 40px;"
                        + "-fx-background-radius: 40px;"
                        + "-fx-text-fill: white;"
        );
        tfSearch.setStyle(
                "-fx-background-radius: 40px;"
                        + "-fx-background-color: #373036;"
                        + "-fx-text-fill: white;"
                        + "-fx-border-radius: 40px;"
                        + "-fx-border-width: 1;"
                        + "-fx-border-color: #FF5246;"

        );
        Image search = new Image("https://javafx-study.oss-cn-hangzhou.aliyuncs.com/icon/search_white.png");
        ImageView imageView = new ImageView(search);
        btnSearch.setGraphic(imageView);
    }

    public void tfMouseExited(MouseEvent mouseEvent) {
        btnSearch.setStyle(
                "-fx-background-color: #44444F;"
                        + "-fx-text-fill: #E9593A;"
                        + "-fx-border-radius: 40px;"
                        + "-fx-background-radius: 40px;"
        );
        tfSearch.setStyle(
                "-fx-background-radius: 40px;"
                        + "-fx-background-color: #373036;"
                        + "-fx-text-fill: white;"
                        + "-fx-border-radius: 40px;"
        );
        Image search = new Image("https://javafx-study.oss-cn-hangzhou.aliyuncs.com/icon/search_orange.png");
        ImageView imageView = new ImageView(search);
        // 给按钮设置图标
        btnSearch.setGraphic(imageView);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image search = new Image("https://javafx-study.oss-cn-hangzhou.aliyuncs.com/icon/search_orange.png");
        ImageView imageView = new ImageView(search);
        // 给按钮设置图标
        btnSearch.setGraphic(imageView);
    }
}
