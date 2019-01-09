package com.zhao.utils.spring;

public class Class1 {

    Class2 class2;

    public void test() {
        System.out.println("Class1");
    }

    public void setClass2(Class2 class2) {
        this.class2 = class2;
    }

    public void testClass2() {
        class2.test();
    }
}
