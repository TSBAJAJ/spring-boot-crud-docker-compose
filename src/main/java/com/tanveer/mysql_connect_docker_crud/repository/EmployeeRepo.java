package com.tanveer.mysql_connect_docker_crud.repository;

import com.tanveer.mysql_connect_docker_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
