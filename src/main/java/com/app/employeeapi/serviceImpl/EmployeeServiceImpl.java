package com.app.employeeapi.serviceImpl;

import com.app.employeeapi.model.Employee;
import com.app.employeeapi.model.StatData;
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
        return this.employeeRepo.findById(id).orElse(new Employee());
    }

    @Override
    public List<Employee> list() {
        return this.employeeRepo.findAll();
    }

    @Override
    public List<Employee> findByTypeContrat(String typeContrat) {
        return this.findByTypeContrat(typeContrat);
    }

    @Override
    public List<Employee> findByEtat(String etat) {
        return this.employeeRepo.findByEtat(etat);
    }

    @Override
    public int countByEtat(String etat) {
        return this.employeeRepo.countByEtat(etat);
    }

    @Override
    public int countByTypeContrat(String type) {
        return this.employeeRepo.countByTypeContrat(type);
    }

    @Override
    public StatData statByQteAndMonth() {
        return null;
    }
}
