package com.acreservationsystem.controller;

import com.acreservationsystem.model.AutocamperDAO;
import com.acreservationsystem.model.AutocamperDAODB;
import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoCamperInfoController {

    AutocamperDAO db = new AutocamperDAODB();

    @FXML
    TextField priceText;

    @FXML
    VBox InfoVbox;

    public void initialize() throws SQLException {
        ResultSet s = db.read(2);
        s.next();
        System.out.print(s.getInt(1));
        priceText.setText(String.valueOf(s.getInt(1)));


    }

    public AutoCamperInfoController() throws SQLException {
    }

    @FXML
    protected void btnRentClick(){
        Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml", 494,433);

    }
    @FXML
    protected void btnReturnClick(){
        Loader.getInstance().switchView("/fxml/autocampers-view.fxml",600,500);

    }
}
