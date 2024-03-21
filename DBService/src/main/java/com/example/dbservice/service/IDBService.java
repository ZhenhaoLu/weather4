package com.example.dbservice.service;

import com.example.dbservice.pojo.dto.EmployeeDTO;
import com.example.dbservice.pojo.entity.Departments;
import com.example.dbservice.pojo.entity.Employees;

public interface IDBService {

    EmployeeDTO findEmployeeById(String id);
    Integer insertEmployee(EmployeeDTO employeeDAO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDAO);
    void deleteEmployee(String id);

    static Employees setEmployees(EmployeeDTO employeeDAO){
        Employees e = new Employees();
        e.setAge(employeeDAO.getAge());
        e.setName(employeeDAO.getName());
        e.setSalary(employeeDAO.getSalary());
        // I can also search database to get all info of the departments, but it takes longer time
        // if error, both methods will throw errors (Constraint Violate or no result found)
        Departments dept_id = new Departments();
        dept_id.setId(employeeDAO.getDept_id());
        e.setDepartment(dept_id);
        return e;
    }

    Departments findDepartmentById(String id);
}
