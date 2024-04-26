package com.acreservationsystem.model;

import java.util.List;

public class Autocamper {
    private int ID;
    private String name;
    private String brand;
    private String plate;
    private String age;
    private int price;
    private int bookingStatusID;
    private int acTypeID;
    private int facilityID;
    private int space;
    private boolean heat;
    private int bedAmount;
    private String kitchenEquipment;

    public Autocamper(
            int ID,
            String name,
            String brand,
            String plate,
            String age,
            int price,
            int bookingStatusID,
            int acTypeID,
            int facilityID,
            int space,
            boolean heat,
            int bedAmount,
            String kitchenEquipment) {
        setID(ID);
        setName(name);
        setBrand(brand);
        setPlate(plate);
        setAge(age);
        setPrice(price);
        setBookingStatusID(bookingStatusID);
        setAcTypeID(acTypeID);
        setFacilityID(facilityID);
        setSpace(space);
        setHeat(heat);
        setBedAmount(bedAmount);
        setKitchenEquipment(kitchenEquipment);

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBookingStatusID() {
        return bookingStatusID;
    }

    public void setBookingStatusID(int bookingStatusID) {
        this.bookingStatusID = bookingStatusID;
    }

    public int getAcTypeID() {
        return acTypeID;
    }

    public void setAcTypeID(int acTypeID) {
        this.acTypeID = acTypeID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean isHeat() {
        return heat;
    }

    public void setHeat(boolean heat) {
        this.heat = heat;
    }

    public int getBedAmount() {
        return bedAmount;
    }

    public void setBedAmount(int bedAmount) {
        this.bedAmount = bedAmount;
    }

    public String getKitchenEquipment() {
        return kitchenEquipment;
    }

    public void setKitchenEquipment(String kitchenEquipment) {
        this.kitchenEquipment = kitchenEquipment;
    }
}
