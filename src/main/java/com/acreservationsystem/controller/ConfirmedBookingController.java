package com.acreservationsystem.controller;

import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConfirmedBookingController {

    @FXML
    VBox confirmedVbox;

    @FXML
    protected void btnContinueClick(){
        ((Stage) confirmedVbox.getScene().getWindow()).close();
        Loader.getInstance().switchView("/fxml/autocampers-view.fxml");
    }

}
