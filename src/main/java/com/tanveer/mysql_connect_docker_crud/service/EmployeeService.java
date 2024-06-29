package com.tanveer.mysql_connect_docker_crud.service;

import com.tanveer.mysql_connect_docker_crud.repository.EmployeeRepo;
import com.tanveer.mysql_connect_docker_crud.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee e) {
        return employeeRepo.save(e);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }
}
