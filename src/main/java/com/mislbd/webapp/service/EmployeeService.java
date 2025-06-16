package com.mislbd.webapp.service;

import com.mislbd.webapp.dto.EmployeeRecord;
import com.mislbd.webapp.entity.Employee;
import com.mislbd.webapp.repsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

//    public Long insertEmployee(Employee employee) {
//        Employee newEmployee = employeeRepository.save(employee);
//        return newEmployee.getEmployeeId();
//    }
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee(EmployeeRecord dto) {
        Employee entity = new Employee(dto.employeeId(), dto.firstName(), dto.lastName());
        return employeeRepository.save(entity);
    }
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);

    }
    public void updateEmployee(EmployeeRecord dto) {
        Employee entity = new Employee(dto.employeeId(), dto.firstName(), dto.lastName());
        employeeRepository.save(entity);
    }


}
