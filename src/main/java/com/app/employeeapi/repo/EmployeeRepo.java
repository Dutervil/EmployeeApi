package com.app.employeeapi.repo;

import com.app.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {

    java.util.List<Employee> findByTypeContrat(String typeContrat);
    java.util.List<Employee> findByEtat(String etat);
    int countByEtat(String etat);
    int countByTypeContrat(String typeContrat);
}
