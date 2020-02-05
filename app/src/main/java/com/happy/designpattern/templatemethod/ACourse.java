package com.happy.designpattern.templatemethod;

public abstract class ACourse {
    protected final void makeCourse() {
        makePPT();
        makePPT();
        if (needWriteArticle()) {
            writeArticle();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作ppt");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");

    }


    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
