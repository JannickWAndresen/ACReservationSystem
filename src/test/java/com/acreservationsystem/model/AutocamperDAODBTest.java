package com.acreservationsystem.model;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AutocamperDAODBTest {
    AutocamperDAO db = new AutocamperDAODB();

    AutocamperDAODBTest() throws SQLException {
    }

    @Test
    void read() throws SQLException {

        ResultSet set = db.read(1);
        while (set.next()) {
            Autocamper ac = new Autocamper(
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
            );
            assertEquals(200, ac.getPrice());
        }
    }
}