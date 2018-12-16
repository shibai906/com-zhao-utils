package com.zhao.utils.spring;

public class Class2 {

    public static class Class3 {
        public void test() {
            System.out.println("Class3");
        }
    }

    private Class1 class1;

    public Class1 getClass1() {
        return class1;
    }

    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

    public Class2(){

    }
    public Class2(Class1 class1) {

    }
    public void test() {
        System.out.println("Class2");
    }
}
