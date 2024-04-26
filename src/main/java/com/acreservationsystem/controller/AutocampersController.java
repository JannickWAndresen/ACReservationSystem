package com.acreservationsystem.controller;

import com.acreservationsystem.model.*;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AutocampersController {

    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private StackPane stackPane;
    @FXML
    private StackPane stackPane2;
    @FXML
    private StackPane stackPane3;
    @FXML
    private StackPane stackPane4;
    @FXML
    private StackPane stackPane5;
    @FXML
    private StackPane stackPane6;
    @FXML
    private Label Item1;
    @FXML
    private Label acTypeItem2;
    @FXML
    private Label acTypeItem3;
    @FXML
    private Label acTypeItem4;
    @FXML
    private Label acTypeItem5;
    @FXML
    private Label acTypeItem6;

    @FXML
    Stage stage;

    AutocamperDAO db = new AutocamperDAODB();


    private final Image image = new Image("/Images/autoCamperAvailable.png");
    private final Image imageBleh = new Image("/Images/HiThere.png");

    List<Autocamper> autocampers = new ArrayList<>();

    public AutocampersController() throws SQLException {
    }


    @FXML
    public void initialize() throws SQLException {



        ResultSet set = db.readAll();
        while(set.next()){
            AutocamperSingleton.getInstance().addAutocamper(new Autocamper(
                    set.getInt(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    (set.getDate(5)).toString(),
                    set.getInt(6),
                    set.getInt(7),
                    set.getInt(8),
                    set.getInt(9),
                    set.getInt(10),
                    set.getBoolean(11),
                    set.getInt(12),
                    set.getString(13)
            ));
        }
        System.out.println(db.readPrice(1));

        image1.setImage(image);
        image1.setPreserveRatio(true);
        image2.setImage(image);
        image2.setPreserveRatio(true);
        image3.setImage(image);
        image3.setPreserveRatio(true);
        image4.setImage(image);
        image4.setPreserveRatio(true);
        image5.setImage(image);
        image5.setPreserveRatio(true);
        image6.setImage(image);
        image6.setPreserveRatio(true);

        ScaleTransition scaleTransition = new ScaleTransition();
        //scaleTransition.setNode(image1);
        scaleTransition.setDuration(Duration.millis(30));
        scaleTransition.setByX(-0.1);
        scaleTransition.setByY(-0.1);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);

        stackPane.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(1);
            scaleTransition.setNode(image1);
            scaleTransition.play();
            closeOldView();
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);


        });

        stackPane2.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(2);
            scaleTransition.setNode(image2);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);
        });

        stackPane3.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(3);
            scaleTransition.setNode(image3);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);
        });

        stackPane4.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(4);
            scaleTransition.play();
            scaleTransition.setNode(image4);
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);
        });

        stackPane5.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(5);
            scaleTransition.setNode(image5);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);
        });

        stackPane6.setOnMouseClicked(mouseEvent -> {
            AutocamperSingleton.getInstance().setChoice(6);
            scaleTransition.setNode(image6);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/autocamperInfo-view.fxml",494,686);

        });

        stackPane.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            //if (newValue) {
            //    image1.setImage(imageBleh);
            //}else {
            //    image1.setImage(image);
            //}
        });


        stackPane2.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);

        });

        stackPane3.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);

        });

        stackPane4.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);

        });

        stackPane5.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);

        });

        stackPane6.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);

        });
    }

    public void closeOldView(){
        if(stage != null){
            stage.close();
        }
    }

}
