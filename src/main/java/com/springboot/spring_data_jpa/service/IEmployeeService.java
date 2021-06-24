package com.springboot.spring_data_jpa.service;


import com.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee getById(int id);

    public void deleteById(int id);

    public List<Employee> findAllByName(String name);
}
