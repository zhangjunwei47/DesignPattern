package com.happy.ps.dependenceinversion;

public class ZhangSan {
    public void study(ICourse iCourse) {
        iCourse.study();
    }
}
