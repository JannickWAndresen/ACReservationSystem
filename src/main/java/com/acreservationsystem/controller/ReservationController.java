package com.acreservationsystem.controller;

import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ReservationController {


    @FXML
    protected void btnConfirmClicked() throws IOException {
        Loader.getInstance().createPopUp("/fxml/confirmBooking-view.fxml");

    }

    @FXML
    protected void btnCancelClicked(){
        Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",467,686);
    }

}
