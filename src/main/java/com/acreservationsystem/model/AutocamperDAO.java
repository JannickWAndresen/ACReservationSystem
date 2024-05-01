package com.acreservationsystem.model;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface AutocamperDAO {
    public void rent(Autocamper ac);
    public ResultSet read(int no) throws SQLException;
    public ResultSet readAll() throws SQLException;
    public int readPrice(int no) throws SQLException;
    public void update (int no, Autocamper ac);
    public boolean delete (int no);
}
