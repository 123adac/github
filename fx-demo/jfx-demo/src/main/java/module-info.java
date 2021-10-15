module com.fxDemo.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxDemo.java.jfx.ctrl to javafx.fxml;
    exports com.fxDemo.java.jfx;

    opens com.fxDemo.java.jfx.layout to javafx.fxml;
    exports com.fxDemo.java.jfx.layout;
}