package com.happy.designpattern.decorator;

public class Test {

    /**
     * 装饰者
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("你好, 装饰者");

        APancake aPancake = new Pancake();
        aPancake = new EggPancake(aPancake);
        aPancake = new EggPancake(aPancake);
        aPancake = new SausagePancake(aPancake);

    }
}
