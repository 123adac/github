module top.xkk.address {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.xkk.address to javafx.fxml;
    exports top.xkk.address;
    exports top.xkk.address.view;
    opens top.xkk.address.view to javafx.fxml;
}