package com.happy.designpattern.facade;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " ");
        return true;
    }
}
