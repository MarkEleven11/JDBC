package org.example;

import org.example.model.Employee;
import org.example.service.EmployeeDAO;
import org.example.service.EmployeeDAOImpl;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee(14, "alex", "clark", "m", 30, 3);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.getAllEmployee().forEach(System.out::println);

        Integer employeeId = employeeDAO.addEmployee(employee);

        System.out.println(employeeDAO.getAllEmployee());

        employeeDAO.updateEmployee(employeeId, employee);

        employeeDAO.deleteEmployee(employeeDAO.getByID(employeeId));

        System.out.println(employeeDAO.getByID(4));
    }
}
