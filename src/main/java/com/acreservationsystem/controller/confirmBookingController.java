package com.acreservationsystem.controller;

import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.text.View;

public class confirmBookingController {
    @FXML
    VBox confirmVbox;



    @FXML
    protected void btnConfirmClicked(){
        Loader.getInstance().switchView("/fxml/confirmedBooking-view.fxml", (Stage) confirmVbox.getScene().getWindow());


    }
    @FXML
    protected void btnCancelClicked(){
        ((Stage) confirmVbox.getScene().getWindow()).close();

    }
}
