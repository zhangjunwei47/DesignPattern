package com.happy.designpattern.composite;

public class Leaf  extends Component{
    private String name = "";


    public Leaf(String name) {
        this.name = name;
    }


    @Override
    public void printfStruct(String preStr) {
        System.out.println(preStr + "-"+ name);
    }
}
