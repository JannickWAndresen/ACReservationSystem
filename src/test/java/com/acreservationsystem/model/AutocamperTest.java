package com.acreservationsystem.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutocamperTest {

    @Test
    void setName() {
        Autocamper autocamper = new Autocamper("Testname","Toyota","DK4000",10, 5000, Boolean.parseBoolean("0"), "Luxury", "1", 55, "Yes",5, "Knife, Spoon");
        autocamper.setName("Peter");

        String actual = autocamper.getName();
        String expected = "Peter";

        assertEquals(expected, actual);
    }

    @Test
    void setPrice1() {
        Autocamper autocamper = new Autocamper("Testname","Toyota","DK4000",10, 5000, Boolean.parseBoolean("0"), "Luxury", "1", 55, "Yes",5, "Knife, Spoon, Frying pan");
        autocamper.setPrice(5001);

        int actual = autocamper.getPrice();
        int expected = 5001;

        assertEquals(expected, actual);
    }
}