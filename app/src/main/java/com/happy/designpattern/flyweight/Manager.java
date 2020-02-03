package com.happy.designpattern.flyweight;

public class Manager implements Employee {

    @Override
    public void report() {

    }

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }


}
