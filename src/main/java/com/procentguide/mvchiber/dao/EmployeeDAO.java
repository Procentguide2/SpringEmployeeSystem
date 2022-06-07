package com.procentguide.mvchiber.dao;

import com.procentguide.mvchiber.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmployee(int id);

}
