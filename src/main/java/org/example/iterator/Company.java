package org.example.iterator;

import java.util.List;

// Concrete Aggregate
class Company implements Aggregate<Employee> {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public CustomIterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}