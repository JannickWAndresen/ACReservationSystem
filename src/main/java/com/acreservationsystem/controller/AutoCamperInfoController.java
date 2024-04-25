package com.acreservationsystem.controller;

import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class AutoCamperInfoController {
    @FXML
    VBox InfoVbox;

    @FXML
    protected void btnRentClick(){
        Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml", 494,433);

    }
    @FXML
    protected void btnReturnClick(){
        Loader.getInstance().switchView("/fxml/autocampers-view.fxml",600,500);

    }
}
