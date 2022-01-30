package com.app.employeeapi.service;

import com.app.employeeapi.model.Employee;
import com.app.employeeapi.model.StatData;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee findById(long id);
    List<Employee> list();
    List<Employee> findByTypeContrat(String typeContrat);
    List<Employee> findByEtat(String etat);
    int countByEtat(String etat);
    int countByTypeContrat(String type);
    StatData statByQteAndMonth();

}
