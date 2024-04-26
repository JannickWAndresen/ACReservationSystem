package com.acreservationsystem.model;

import com.acreservationsystem.view.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Loader {
    private static Loader instance;
    private Stage stage;
    //private Stage confirmBooking;
    //private Stage confirmedBooking;

    private Loader (){

    }

    public static Loader getInstance(){
        if(instance == null){
            instance = new Loader();
        }
        return instance;
    }
    public void setStage(Stage stage) throws IOException {
        this.stage = stage;
        switchView("/fxml/autocampers-view.fxml",600,500);
    }
    public void switchView(String fxmlFile, Stage tempStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load(), 184, 109);
            tempStage.setScene(scene);
            tempStage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void switchView(String fxmlFile, int width, int height) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void createPopUp(String fxmlFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load(), 184, 109);
            Stage popup = new Stage();
            popup.setScene(scene);
            popup.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
