package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long empId);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long empId, Employee employee);

    void deleteEmployee(Long empId);
}