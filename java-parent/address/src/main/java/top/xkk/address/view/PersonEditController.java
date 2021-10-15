package top.xkk.address.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import top.xkk.address.MainApp;
import top.xkk.address.model.Person;
import top.xkk.address.config.AppConstant;

public class PersonEditController {
    private Stage editStage;

    private MainApp mainApp;

    private Person person;

    private String type;

    @FXML
    private TextField nameField;

    @FXML
    private TextField clazzField;

    @FXML
    private RadioButton maleButton;

    @FXML
    private RadioButton femaleButton;

    @FXML
    private ToggleGroup group;

    @FXML
    private TextField addressField;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private TextField avatarField;

    @FXML
    private void initialize() {

    }

    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }

    public void setArgs(Person person, String type) {
        this.person = person;
        this.type = type;
        nameField.setText(person.getName());
        clazzField.setText(person.getClazz());
        group.getToggles().forEach(toggle -> {
            if (toggle.getUserData().toString().equals(person.getGender())) {
                toggle.setSelected(true);
            }
        });
        addressField.setText(person.getAddress());
        avatarField.setText(person.getAvatar().getUrl());
        birthdayPicker.setValue(person.getBirthday());
    }

    public void handleSubmit(ActionEvent actionEvent) {
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(birthdayPicker.getValue());
        // 性别
        if (maleButton.isSelected()) {
            person.setGender("男");
        } else {
            person.setGender("女");
        }
        if (this.type.equals(AppConstant.NEW_PERSON)) {
            mainApp.getPersonData().add(person);
        }
//        group.selectedToggleProperty().addListener((ov,oldVal,newVal) -> {
//            person.setGender(group.getSelectedToggle().getUserData().toString());
//        });
        mainApp.showPerson();
    }

    public void handleCancel() {
        mainApp.showPerson();
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
