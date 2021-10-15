package top.xkk.address;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import top.xkk.address.model.Person;
import top.xkk.address.view.BirthdayStatisticsController;
import top.xkk.address.view.PersonController;
import top.xkk.address.view.PersonEditController;
import top.xkk.address.view.RootController;

import java.io.IOException;
import java.time.LocalDate;

public class MainApp extends Application {
    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    private Stage primaryStage;

    private BorderPane rootLayout;

    public MainApp() {
        personData.add(new Person("王林", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img12.jpg")));
        personData.add(new Person("彭海洋", "软件2026", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://images.unsplash.com/photo-1633099702771-ce69a3ebb7bf?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTE5MA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("郭佳", "软件2026", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://images.unsplash.com/photo-1632984512706-029f5e57e6fd?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTEzNA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("黄志伟", "软件2026", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1631415323509-7e870d79cabc?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTM1OQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("张珂", "软件2026", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img14.jpg")));
        personData.add(new Person("赵丹", "软件2036", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img15.jpg")));
        personData.add(new Person("张建凤", "软件2036", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img16.jpg")));
        personData.add(new Person("杨阳", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img17.jpg")));
        personData.add(new Person("尚宇驰", "软件2026", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img20.jpg")));
        personData.add(new Person("陈蓉琪", "软件2026", "女", "江苏南京",
                LocalDate.of(2000, 3, 21), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img19.jpg")));
    }

    public Stage getStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        stage.setTitle("AddressBook");
        initRootLayout();
        showPerson();
    }

    public void initRootLayout() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
//            FXMLLoader fxmlLoader1 = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/root-layout.fxml"));
            rootLayout = fxmlLoader.load();
            RootController controller = fxmlLoader.getController();
            controller.setMainApp(this);
            Scene scene = new Scene(rootLayout,820,540);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPerson() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            rootLayout.setCenter(anchorPane);
            PersonController controller = fxmlLoader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showNewPersonStage() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/person-edit.fxml"));
            AnchorPane anchorPane = loader.load();
            Stage editStage = new Stage();
            editStage.setTitle("Edit Person");
            Scene scene = new Scene(anchorPane,640,480);
            editStage.setScene(scene);
            PersonEditController controller = loader.getController();
            controller.setEditStage(editStage);
            controller.setMainApp(this);
            editStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showEditPerson(Person person, String type) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person-edit.fxml"));
            AnchorPane editPersonPane = fxmlLoader.load();
            // 根布局中间部分加入人员编辑面板
            rootLayout.setCenter(editPersonPane);
            // 获得PersonEditController控制器
            PersonEditController controller = fxmlLoader.getController();
            // 向控制器传参
            controller.setArgs(person, type);
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBirthdayStatistics() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/birthday-statistics.fxml"));
            AnchorPane page = loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Birthday Statistics");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            BirthdayStatisticsController controller = loader.getController();
            controller.setPersonData(personData);
            dialogStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch();
    }
}