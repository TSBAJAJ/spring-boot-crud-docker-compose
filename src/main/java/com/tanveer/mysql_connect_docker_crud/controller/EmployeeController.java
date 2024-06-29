package com.tanveer.mysql_connect_docker_crud.controller;

import com.tanveer.mysql_connect_docker_crud.service.EmployeeService;
import com.tanveer.mysql_connect_docker_crud.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> allEmployees = employeeService.findAllEmployees();
        return ResponseEntity.ok(allEmployees);
    }

    @GetMapping("/get/save")
    public ResponseEntity<Employee> saveEmployeeGet() {
        Employee employee = new Employee();
        employee.setFirstName("Tanveer");
        employee.setLastName("Singh");
        employee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

        employee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(employee);
    }
}
