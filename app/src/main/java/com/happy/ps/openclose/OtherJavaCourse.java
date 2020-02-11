package com.happy.ps.openclose;

public class OtherJavaCourse extends JavaCourse {
    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}
