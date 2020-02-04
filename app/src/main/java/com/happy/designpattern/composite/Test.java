package com.happy.designpattern.composite;

public class Test {

    public static void main(String[] args) {
        System.out.println("组合设计模式");

        Component root = new Composite("服装");
        Component sonMan = new Composite("男装");
        Component sonWomen = new Composite("女装");

        Component leaf1  = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        root.addChild(sonMan);
        root.addChild(sonWomen);
        sonMan.addChild(leaf1);
        sonMan.addChild(leaf2);
        sonWomen.addChild(leaf3);
        sonWomen.addChild(leaf4);

        root.printfStruct("");
    }
}
