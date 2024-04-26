package com.acreservationsystem.model;

import java.sql.*;
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
    public ResultSet read(int no) throws SQLException {
        //int ac;
        CallableStatement c = con.prepareCall("{CALL GetACPrice(?)}");
        c.setInt(1, no);


        return c.executeQuery();
    }
    public int readPrice(int no) throws SQLException {
        int price;
        CallableStatement c = con.prepareCall("{CALL GetACPrice(?)}");
        c.setInt(1, no);
        ResultSet s = c.executeQuery();
        s.next();
        return s.getInt(1);
    }

    @Override
    public ResultSet readAll() throws SQLException {
        PreparedStatement s = con.prepareStatement("SELECT * FROM tblAutocamper");
        s.executeQuery();
        return s.executeQuery();
    }

    @Override
    public void update(int no, Autocamper ac) {

    }

    @Override
    public boolean delete(int no) {
        return false;
    }
}
