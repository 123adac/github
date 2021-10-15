module com.example.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java.jfx.ctrl to javafx.fxml;
    exports com.example.java.jfx;

    opens com.example.java.jfx.layout to javafx.fxml;
    exports com.example.java.jfx.layout;

    opens com.example.java.jfx.basic to javafx.fxml;
    exports com.example.java.jfx.basic;

    opens com.example.java.jfx.effect to javafx.fxml;
    exports com.example.java.jfx.effect;
}