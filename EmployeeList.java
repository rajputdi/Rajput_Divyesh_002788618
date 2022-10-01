/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemgmnt;

import java.util.ArrayList;
/**
 *
 * @author Divyesh Rajput
 */
public class EmployeeList {
    private ArrayList<CreateEmployee> employee;
    
    public EmployeeList(){
        this.employee = new ArrayList<CreateEmployee>();
    }

    public ArrayList<CreateEmployee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<CreateEmployee> employee) {
        this.employee = employee;
    }
    public CreateEmployee addNewEmployee(){
        
        CreateEmployee newEmployee = new CreateEmployee();
        employee.add(newEmployee);
        return newEmployee;
    }

    public void deleteEmployee(CreateEmployee de) {
        employee.remove(de);
        
    }
    
}
