package com.happy.designpattern.composite;

public abstract class Component {

    /**
     * 输出组件自身的名称
     * @param preStr
     */
    public abstract void printfStruct(String preStr);

    /**
     * 向组合对象中加入组件对象
     * @param component
     */
    public void addChild(Component component) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移除某个对象
     * @param component
     */
    public void removeChild(Component component) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     *
     * @param index
     * @return
     */
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

}
