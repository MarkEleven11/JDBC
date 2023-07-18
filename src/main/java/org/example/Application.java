package org.example;

import org.example.model.City;
import org.example.model.Employee;
import org.example.service.CityDAO;
import org.example.service.CityDAOImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee(14, "alex", "clark", "m", 30, new City());

        CityDAO cityDAO = new CityDAOImpl();

//        EmployeeDAO = new EmployeeDAOImpl();
//        employeeDAO.getAllEmployee().forEach(System.out::println);
//
//        Integer employeeId = employeeDAO.addEmployee(employee);
//
//        System.out.println(employeeDAO.getAllEmployee());
//
//        employeeDAO.updateEmployee(employeeId, employee);
//
//        employeeDAO.deleteEmployee(employeeDAO.getByID(employeeId));
//
//        System.out.println(employeeDAO.getByID(4));

        cityDAO.addCity(new City("Kolomna"));
        List<City>list = cityDAO.readAllCity();

        City city = new City("Tula");
        cityDAO.addCity(city);
        cityDAO.deleteCity(cityDAO.readCityByID(3));
        cityDAO.updateCity(new City("Samara"));


    }
}
