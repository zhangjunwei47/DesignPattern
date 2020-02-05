package com.happy.designpattern.templatemethod;

public class JavaCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供代码");
        System.out.println("提供课程");
    }
}
