package com.acreservationsystem.controller;

import com.acreservationsystem.model.Loader;
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

import java.io.IOException;
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
    FXMLLoader loader;
    @FXML
    Scene scene;
    @FXML
    Stage stage;


    private final Image image = new Image("/Images/autoCamperAvailable.png");
    private final Image imageBleh = new Image("/Images/HiThere.png");


    @FXML
    public void initialize() {
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
            scaleTransition.setNode(image1);
            scaleTransition.play();
            closeOldView();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");


        });

        stackPane2.setOnMouseClicked(mouseEvent -> {
            scaleTransition.setNode(image2);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");
        });

        stackPane3.setOnMouseClicked(mouseEvent -> {
            scaleTransition.setNode(image3);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");
        });

        stackPane4.setOnMouseClicked(mouseEvent -> {
            scaleTransition.setNode(image4);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");
        });

        stackPane5.setOnMouseClicked(mouseEvent -> {
            scaleTransition.setNode(image5);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");
        });

        stackPane6.setOnMouseClicked(mouseEvent -> {
            scaleTransition.setNode(image6);
            scaleTransition.play();
            Loader.getInstance().switchView("/fxml/ReservationForm-View.fxml");

        });

        stackPane.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image1.setImage(imageBleh);
            }else {
                image1.setImage(image);
            }
        });


        stackPane2.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image2.setImage(imageBleh);
            }else {
                image2.setImage(image);
            }
        });

        stackPane3.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image3.setImage(imageBleh);
            }else {
                image3.setImage(image);
            }
        });

        stackPane4.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image4.setImage(imageBleh);
            }else {
                image4.setImage(image);
            }
        });

        stackPane5.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image5.setImage(imageBleh);
            }else {
                image5.setImage(image);
            }
        });

        stackPane6.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image6.setImage(imageBleh);
            }else {
                image6.setImage(image);
            }
        });
    }

    public void closeOldView(){
        if(stage != null){
            stage.close();
        }
    }

}
