module top.xkk.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;

    opens top.xkk.weather to javafx.fxml;
    exports top.xkk.weather;

    opens top.xkk.weather.view to javafx.fxml;
    exports top.xkk.weather.view;

    exports top.xkk.weather.util;
}