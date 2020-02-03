package com.happy.designpattern.facade;

public class Test {

    /**
     * 外观
     * @param args
     */
    public static void main(String[] args) {
         GiftExchangeService giftExchangeService = new GiftExchangeService();
         giftExchangeService.giftExchange(new PointsGift("哈哈"));
    }
}
