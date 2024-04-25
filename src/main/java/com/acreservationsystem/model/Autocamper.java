package com.acreservationsystem.model;

import java.util.List;

public class Autocamper {
    private String name;
    private String brand;
    private int plate;
    private int age;
    private int price;
    private boolean status;
    private String type;
    private String facility;
    private int space;
    private String heat;
    private int bed;
    private List<String> kitchenEquipment;
    public Autocamper(
            String name,
            String brand,
            int plate,
            int age,
            int price,
            boolean status,
            String type,
            String facility,
            int space,
            String heat,
            int bed,
            List<String> kitchenEquipment){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }
    public int getBed() {
        return bed;
    }
    public void setBed(int bed) {
        this.bed = bed;
    }
    public List<String> getKitchenEquipment() {
        return kitchenEquipment;
    }
    public void setKitchenEquipment(List<String> kitchenEquipment) {
        this.kitchenEquipment = kitchenEquipment;
    }
}
