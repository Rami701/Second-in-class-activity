package com.example.secondinclassactivity;

public class Employee {
    private String name;
    private String salary;
    private String isFullTime;

    public Employee(String name, String salary, String isFullTime) {
        this.name = name;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getIsFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(String isFullTime) {
        this.isFullTime = isFullTime;
    }
}
