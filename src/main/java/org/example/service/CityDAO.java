package org.example.service;
import org.example.model.City;
import java.util.List;

public interface CityDAO {

    City addCity(City city);

    City readCityByID(int id);

    List<City> readAllCity();

    City updateCity (City city);

    void deleteCity(City city);
}
