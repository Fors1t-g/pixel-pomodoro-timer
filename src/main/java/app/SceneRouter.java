package app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

// смена сцен
public class SceneRouter {
    private static Scene scene;
    private static AppContext appContext;

    private SceneRouter() {

    }

    public static void setScene(Scene scene) {
        SceneRouter.scene = scene;
    }

    public static void setAppContext(AppContext appContext) {
        SceneRouter.appContext = appContext;
    }

    public static void switchSceneTo(SceneEnum sceneEnum) {
        if (scene == null) {
            throw new IllegalStateException("SceneRouter не инициализирован");
        }
        try {
            FXMLLoader loader = new FXMLLoader(SceneRouter.class.getResource(sceneEnum.getFileName()));
            scene.setRoot(loader.load());
            Object controller = loader.getController();
            if (controller instanceof AppContextAware) {
                ((AppContextAware) controller).setAppContext(appContext);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
