package com.happy.designpattern.factory;

public class AndroidVideo extends Video {
    @Override
    public void produce() {
        System.out.println("这是一个android视频");
    }
}
