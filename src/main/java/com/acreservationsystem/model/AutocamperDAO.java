package com.acreservationsystem.model;
import java.util.List;


public interface AutocamperDAO {
    public void rent(Autocamper ac);
    public Autocamper read(int no);

    public List<Autocamper> readAll();

    public void update (int no, Autocamper ac);

    public boolean delete (int no);

}
