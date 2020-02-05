package com.happy.designpattern.templatemethod;

public class AndroidCourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供代码");
    }

    public AndroidCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
