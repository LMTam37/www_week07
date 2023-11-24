package vn.edu.iuh.fit.week_07.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week_07.models.Employee;
import vn.edu.iuh.fit.week_07.repositories.EmployeeRepository;
import vn.edu.iuh.fit.week_07.services.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + empId));
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long empId, Employee employee) {
        if (!employeeRepository.existsById(empId)) {
            throw new EntityNotFoundException("Employee not found with id: " + empId);
        }
        employee.setEmpId(empId);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long empId) {
        if (!employeeRepository.existsById(empId)) {
            throw new EntityNotFoundException("Employee not found with id: " + empId);
        }
        employeeRepository.deleteById(empId);
    }
}