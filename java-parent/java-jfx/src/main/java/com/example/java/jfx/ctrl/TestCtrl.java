package com.example.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class TestCtrl {

    public Button btn;

    public DatePicker datePicker;

    public void onBtnClick(ActionEvent actionEvent) {
        datePicker.setVisible(!datePicker.isVisible());
    }
}
