package org.example.service;

import com.sun.jdi.connect.spi.Connection;
import org.example.model.Employee;

import java.sql.ConnectionBuilder;
import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void addEmployee(Employee employee) {
        try (PreparedStatement statement = Connectio){

        }

    }

    @Override
    public Employee getByID(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public void updateEmployee(int id, Employee employee) {

    }

    @Override
    public void deleteEmployee(int id) {

    }
}
