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
    private double xOffset;
    private double yOffset;

    @Override
    public void start(Stage stage) throws Exception {
        AppContext appContext = new AppContext();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/pomodoro/timer/fxml/main-view.fxml"));
        Parent root = loader.load();

        // перетаскивание окна

        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);

        });
        // контекст
        Object controller = loader.getController();
        if (controller instanceof AppContextAware) {
            ((AppContextAware) controller).setAppContext(appContext);
        }

        Scene scene = new Scene(root, 500, 600);
        scene.getStylesheets().add(getClass().getResource("/org/pomodoro/timer/style/pixel.css").toExternalForm());
        stage.initStyle(StageStyle.UNDECORATED);
        var iconUrl = getClass().getResource("/org/pomodoro/timer/images/newlogo.png");
        if (iconUrl != null) {
            stage.getIcons().add(new Image(iconUrl.toExternalForm()));
        }
        stage.setTitle("Pixel Pomodoro Timer");
        stage.setScene(scene);
        SceneRouter.setScene(scene);
        SceneRouter.setAppContext(appContext);
        stage.show();


    }
}
