package com.happy.designpattern.builder;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().setName("哈哈").setNote("嘿嘿").build();
        System.out.println("建造者模式: " + course.toString());
    }
}
