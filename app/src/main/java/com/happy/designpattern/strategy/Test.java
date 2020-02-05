package com.happy.designpattern.strategy;

public class Test {

    public static void main(String[] args) {
        System.out.println("这个是策略模式");

        PromotionActivity promotionActivity = new PromotionActivity(new FanXianPromotion());
        promotionActivity.executePromotionStrategy();
    }
}
