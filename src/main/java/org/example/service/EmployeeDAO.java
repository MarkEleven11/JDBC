package org.example.service;

import org.example.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    Integer addEmployee(Employee employee);

    Employee getByID(int id);

    List<Employee> getAllEmployee();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(Employee employee);


}
