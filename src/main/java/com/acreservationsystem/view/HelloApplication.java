package com.acreservationsystem.view;

import com.acreservationsystem.model.Loader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Loader.getInstance().setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}