package com.happy.ps.dependenceinversion;

public class Test {
    private static final String TAG = "依赖倒置原则";

    public static void main(String[] args) {

    }

//    private void study() {
//        ZhangSan zhangSan = new ZhangSan();
//        zhangSan.studyJava();
//        zhangSan.studyKotlin();
//    }

    private void study() {
        ZhangSan zhangSan = new ZhangSan();
        ICourse javaCourse = new JavaCourse();
        ICourse kotlinCourse = new KotlinCourse();
        zhangSan.study(javaCourse);
        zhangSan.study(kotlinCourse);
    }
}

