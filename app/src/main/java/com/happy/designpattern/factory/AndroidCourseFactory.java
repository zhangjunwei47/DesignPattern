package com.happy.designpattern.factory;

public class AndroidCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new AndroidVideo();
    }

    @Override
    public Article getArticle() {
        return new AndroidArticle();
    }
}
