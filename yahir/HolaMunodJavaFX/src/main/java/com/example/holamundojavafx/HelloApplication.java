package com.example.holamundojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Label label = new Label("Hola 3C");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Mi primer app en Java FX!");
        Image icon = new Image(getClass().getResourceAsStream("/icon/icon.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
