package com.happy.designpattern.factory;

public class Test {

    /**
     * 工厂
     * @param args
     */
    public static void main(String[] args) {
        CourseFactory courseFactory = new AndroidCourseFactory();
        courseFactory.getArticle();
        courseFactory.getVideo();
    }
}
