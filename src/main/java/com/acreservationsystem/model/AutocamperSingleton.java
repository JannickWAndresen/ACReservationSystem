package com.acreservationsystem.model;

import java.util.ArrayList;
import java.util.List;

public class AutocamperSingleton {

    private static AutocamperSingleton instance;
    private List<Autocamper> autocamperList = new ArrayList<>();

    private int choice;

    public Autocamper getAutocamper(int autocamperID){


        return autocamperList.get(autocamperID);

    }


    public static AutocamperSingleton getInstance(){
        if(instance == null){
            instance = new AutocamperSingleton();
        }
        return instance;
    }

    public void addAutocamper(Autocamper a){

        autocamperList.add(a);
    }
    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
