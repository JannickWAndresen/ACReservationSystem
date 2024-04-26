package com.acreservationsystem.controller;

import com.acreservationsystem.model.AutocamperDAO;
import com.acreservationsystem.model.AutocamperDAODB;
import com.acreservationsystem.model.AutocamperSingleton;
import com.acreservationsystem.model.Loader;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoCamperInfoController {
    @FXML
    TextField priceTF;
    @FXML
    TextField bedAmountTF;
    @FXML
    TextField autoCamperTypeTF;
    @FXML
    TextField personsTF;
    @FXML
    TextField heatTF;
    @FXML
    TextField spaceTF;
    @FXML
    TextField brandTF;
    @FXML
    TextArea kitchenAreaTA;
    @FXML
    TextField acModelTF;


    @FXML
    VBox InfoVbox;

    public void initialize() throws SQLException {
        int choice = AutocamperSingleton.getInstance().getChoice()-1;
        priceTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getPrice()));
        bedAmountTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getBedAmount()));
        autoCamperTypeTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getAcTypeID()));
        personsTF.setText(String.valueOf(4));
        heatTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).isHeat()));
        spaceTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getSpace()));
        brandTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getBrand()));
        kitchenAreaTA.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getKitchenEquipment()));
        acModelTF.setText(String.valueOf(AutocamperSingleton.getInstance().getAutocamper(choice).getName()));


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
