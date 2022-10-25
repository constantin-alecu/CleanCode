package com.ing.java.dev.school.solid.single_responsibility.bad;

import java.util.List;

public class Employee {
}

interface EmployeeStore{
    Employee getEmployeeById(int id);

    void addEmployee(Employee employee);

    void sendEmailText(Employee employee, String textContent);
}

class InMemoryEmployeeStore implements  EmployeeStore{

    static List<Employee> employees;

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sendEmail(Employee employee, String textContent) {
        //mailServer.sendEmail(employee.getEmailAddress(), content);
    }
}
