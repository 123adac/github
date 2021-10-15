package com.fxDemo.java.jfx.layout;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 锚点布局
 */
public class AnchorPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        AnchorPane anchorPane = new AnchorPane();

        // 圆柱
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(180.0f);
        cylinder.setRadius(100.0f);

        // 材料
        PhongMaterial phongMaterial = new PhongMaterial();
        // 设置漫反射颜色
        phongMaterial.setDiffuseColor(Color.BLANCHEDALMOND);

        cylinder.setMaterial(phongMaterial);

        // 旋转过渡
        RotateTransition rotateTransition = new RotateTransition();
        // 设置时间
        rotateTransition.setDuration(Duration.millis(1000));
        // 设置对象
        rotateTransition.setNode(cylinder);
        // 设置轴
        rotateTransition.setAxis(Rotate.X_AXIS);
        // 设置角度
        rotateTransition.setByAngle(180);
        // 设置循环次数，无限
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        // 设置自动反向
        rotateTransition.setAutoReverse(false);
        // 开始
        rotateTransition.play();

        anchorPane.getChildren().add(cylinder);
        AnchorPane.setTopAnchor(cylinder,100.0);
        AnchorPane.setLeftAnchor(cylinder,150.0);

        Scene scene = new Scene(anchorPane,400,300);
        stage.setTitle("AnchorPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
