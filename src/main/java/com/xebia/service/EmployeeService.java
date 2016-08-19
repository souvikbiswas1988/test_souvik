package com.xebia.service;

import com.xebia.domain.Employee;

import java.util.Collection;

interface EmployeeService {
     Collection<Employee> findAll();
}
