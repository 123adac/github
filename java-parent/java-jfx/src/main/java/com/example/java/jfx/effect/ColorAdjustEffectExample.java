package com.example.java.jfx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ColorAdjustEffectExample extends Application {
    @Override
    public void start(Stage stage) {
        Image image = new Image("https://cdn.jsdelivr.net/gh/kaikaixue/image-hosting@master/20211007/image.3gisbp570e40.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(60);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        ColorAdjust colorAdjust = new ColorAdjust();
        // 设置对比度
        colorAdjust.setContrast(0.4);
        // 设置色调
        colorAdjust.setHue(-0.05);
        // 设置亮度
//        colorAdjust.setBrightness(0.9);
        // 设置饱和度
//        colorAdjust.setSaturation(0.5);

        imageView.setEffect(colorAdjust);

        Group group = new Group(imageView);

        Scene scene = new Scene(group,500,300);
        stage.setTitle("Color Adjust effect example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
