module com.example.holamunodjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.holamunodjavafx to javafx.fxml;
    exports com.example.holamunodjavafx;
    exports com.example.holamundojavafx;
    opens com.example.holamundojavafx to javafx.fxml;
}