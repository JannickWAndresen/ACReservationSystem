package com.acreservationsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class AutocamperDAODB implements AutocamperDAO {
    private static final String dbName = "dbAutocampingWagner";
    private static final String userName = "sa";
    private static final String password = "1234";
    private static final String port = "1433";
    private static final String url = "jdbc:sqlserver://localhost:"+port+";databaseName="+dbName+";encrypt=true;trustServerCertificate=true";
    private static Properties properties = new Properties();
    Connection con;

    //Constructor for setting properties for connection to database.
    public AutocamperDAODB() throws SQLException {
        properties.setProperty("user", userName);
        properties.setProperty("password", password);
        properties.setProperty("encrypt", "false");
        this.con = DriverManager.getConnection(url, userName, password);
    }

    @Override
    public void rent(Autocamper ac) {

    }

    @Override
    public Autocamper read(int no) {
        return null;
    }

    @Override
    public List<Autocamper> readAll() {
        return null;
    }

    @Override
    public void update(int no, Autocamper ac) {

    }

    @Override
    public boolean delete(int no) {
        return false;
    }
}
