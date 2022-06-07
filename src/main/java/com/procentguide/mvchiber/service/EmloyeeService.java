package com.procentguide.mvchiber.service;

import com.procentguide.mvchiber.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmloyeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmployee(int id);

}
