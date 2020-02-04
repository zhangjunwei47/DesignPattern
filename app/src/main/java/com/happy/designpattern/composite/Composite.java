package com.happy.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {


    private List<Component> childComponents = null;

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }

        childComponents.add(component);
    }

    @Override
    public void removeChild(Component component) {

    }

    @Override
    public void printfStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);
        if (this.childComponents != null) {
            preStr += " ";
            for (Component c : childComponents) {
                c.printfStruct(preStr);
            }
        }
    }
}
