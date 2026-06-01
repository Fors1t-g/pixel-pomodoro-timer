package app;

// сцены
public enum SceneEnum {
    MAIN("/org/pomodoro/timer/fxml/main-view.fxml"),
    SHOP("/org/pomodoro/timer/fxml/shop-view.fxml"),
    STATS("/org/pomodoro/timer/fxml/stats-view.fxml"),
    ACHIEVEMENTS("/org/pomodoro/timer/fxml/achievements-view.fxml"),
    TIMER("/org/pomodoro/timer/fxml/timer-view.fxml");

    private final String filename;
    SceneEnum(String filename) {
        this.filename = filename;
    }

    public String getFileName() {
        return filename;
    }
}
