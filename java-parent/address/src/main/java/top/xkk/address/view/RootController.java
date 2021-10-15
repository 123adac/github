package top.xkk.address.view;

import javafx.fxml.FXML;
import top.xkk.address.MainApp;

public class RootController {
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleShowBirthdayStatistics() {
        mainApp.showBirthdayStatistics();
    }
}
