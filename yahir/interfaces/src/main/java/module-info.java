module yahir.com.interfaces {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens yahir.com.interfaces to javafx.fxml;
    exports yahir.com.interfaces;
}