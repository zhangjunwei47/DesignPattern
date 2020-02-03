package com.happy.designpattern.adapter.objectadapter;

public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new Adapter();
        dc5V.output();
    }
}
