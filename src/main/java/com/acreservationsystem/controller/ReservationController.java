package com.acreservationsystem.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ReservationController {
    FXMLLoader loader;
    Scene scene;

    public void createPopup(String fxmlFile) throws IOException {
        loader = new FXMLLoader(getClass().getResource(fxmlFile));
        scene = new Scene(loader.load(), 600,500);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
    }
}
