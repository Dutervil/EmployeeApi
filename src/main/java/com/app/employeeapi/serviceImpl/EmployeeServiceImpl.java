package com.app.employeeapi.serviceImpl;

import com.app.employeeapi.model.Employee;
import com.app.employeeapi.repo.EmployeeRepo;
import com.app.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service @Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepo.save(employee);

    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    @Override
    public Employee findById(long id) {
        return this.employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> list() {
        return this.employeeRepo.findAll();
    }

    @Override
    public List<Employee> findByTypeContrat(String typeContrat) {
        return null;
    }

    @Override
    public List<Employee> findByEtat(String etat) {
        return null;
    }

    @Override
    public int countByEtat(String etat) {
        return 0;
    }

    @Override
    public int countByTypeContrat(String type) {
        return 0;
    }
}
