package com.app.employeeapi.repo;

import com.app.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {
}
