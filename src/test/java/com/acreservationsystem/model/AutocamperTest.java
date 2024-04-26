package com.acreservationsystem.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutocamperTest {

    @Test
    void setName() {
        Autocamper autocamper = new Autocamper(1,"Testname","Toyota","DK4000","2020-10-24", 5000, 1, 1, 1, 55, true,5, "Knife, Spoon");
        autocamper.setName("Peter");

        String actual = autocamper.getName();
        String expected = "Peter";

        assertEquals(expected, actual);
    }

    @Test
    void setPrice1() {
        Autocamper autocamper = new Autocamper(1, "Testname","Toyota","DK4000","2020-10-24", 5000, 1, 1, 1, 55, true,5, "Knife, Spoon, Frying pan");
        autocamper.setPrice(5001);

        int actual = autocamper.getPrice();
        int expected = 5001;

        assertEquals(expected, actual);
    }
}