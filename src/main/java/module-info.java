module org.example.timer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires static lombok;
    requires java.desktop;

    opens app to javafx.fxml;
    exports app;
}