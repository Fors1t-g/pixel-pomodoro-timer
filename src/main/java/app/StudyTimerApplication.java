package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StudyTimerApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        AppContext appContext = new AppContext();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/pomodoro/timer/fxml/main-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 500, 600);
        scene.getStylesheets().add(getClass().getResource("/org/pomodoro/timer/style/pixel.css").toExternalForm());

        stage.initStyle(StageStyle.UNDECORATED);
        Image icon = new Image("newlogo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Pixel Pomodoro Timer");
        stage.setScene(scene);
        stage.show();


    }
}
