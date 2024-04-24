package com.acreservationsystem.controller;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

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

    private final Image image = new Image("C:\\Users\\mikae\\Downloads\\school-bus.png");
    private final Image imageBleh = new Image("C:\\Users\\mikae\\Downloads\\bleh.png");

    @FXML
    public void initialize() {
        image1.setImage(image);
        image2.setImage(image);
        image3.setImage(image);
        image4.setImage(image);
        image5.setImage(image);
        image6.setImage(image);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(image1);

        scaleTransition.setDuration(Duration.millis(30));
        scaleTransition.setByX(-0.1);
        scaleTransition.setByY(-0.1);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);

        image1.setOnMouseClicked(mouseEvent -> {
            scaleTransition.play();
        });

        image1.hoverProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (newValue) {
                image1.setImage(imageBleh);
            }else {
                image1.setImage(image);
            }
        });
    }
}
