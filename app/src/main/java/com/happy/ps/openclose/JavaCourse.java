package com.happy.ps.openclose;

public class JavaCourse implements ICourse {

    @Override
    public String getName() {
        return "java课程";
    }

    @Override
    public double getPrice() {
        return 11.11;
    }
}
