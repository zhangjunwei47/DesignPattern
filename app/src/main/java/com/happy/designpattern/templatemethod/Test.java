package com.happy.designpattern.templatemethod;

import com.happy.designpattern.bridge.Account;

public class Test {
    public static void main(String[] args) {
        System.out.println("模板设计模式");
        ACourse course = new AndroidCourse(false);
        course.makeCourse();

        ACourse javaCourse = new JavaCourse();
        javaCourse.makeCourse();
    }
}
