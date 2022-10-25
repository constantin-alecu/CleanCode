package com.ing.java.dev.school.solid.single_responsibility.good;

import java.util.List;

public class Employee {
}

interface EmployeeStore{
    Employee getEmployeeById(int id);

    void addEmployee(Employee employee);

}

interface EmailSender{
    void sendEmail(Employee employee, EmailContent content);
}

class HttpEmailSender implements EmailSender{

    @Override
    public void sendEmail(Employee employee, EmailContent content) {
        //
    }
}
interface EmailContent{}

class HTMLEmailContent implements EmailContent {
    String htmlContent;
}
class InMemoryEmployeeStore implements EmployeeStore {

    static List<Employee> employees;

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}


