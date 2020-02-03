package com.happy.designpattern.facade;

public class GiftExchangeService {
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                if (shippingService.shipGift(pointsGift)) {

                }
            }
        }

    }

}
