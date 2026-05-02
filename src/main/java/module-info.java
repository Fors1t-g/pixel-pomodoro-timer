module org.example.timer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.pomodoro.timer to javafx.fxml;
    exports org.pomodoro.timer;
}