package com.acreservationsystem.controller;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Timer;
import java.util.concurrent.Delayed;

public class AutocampersController {

    @FXML
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;

    private final Image image = new Image("C:\\Users\\mikae\\Downloads\\school-bus.png");
    private final Image imageBleh = new Image("C:\\Users\\mikae\\Downloads\\bleh.png");

    @FXML
    public void initialize() {
        image1.setImage(image);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(image1);

        scaleTransition.setDuration(Duration.millis(80));
        scaleTransition.setByX(-0.3);
        scaleTransition.setByY(-0.3);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);

        image1.setOnMouseClicked(mouseEvent -> {
            scaleTransition.play();
        });

        image1.hoverProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                image1.setImage(imageBleh);
            }else {
                image1.setImage(image);
            }
        });
    }



}
