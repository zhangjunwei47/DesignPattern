package com.happy.designpattern.factory;

public class AndroidArticle extends Article {
    @Override
    public void produce() {
        System.out.println("这是一个android手记");
    }
}
