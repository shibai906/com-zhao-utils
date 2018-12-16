package com.zhao.utils.spring;

import java.beans.ConstructorProperties;

public class DIExample {

    public int years;
    public String text;
    public String ace;

    @ConstructorProperties({"years","text"})
    public DIExample(int years,String text) {
        this.years=years;
        this.text = text;
    }

    public DIExample(int years) {
        this.years = years;
    }

    public DIExample(String text,String ace) {
        this.text = text;
        this.ace = ace;
    }

    @Override
    public String toString() {
        return "DIExample{" +
                "years=" + years +
                ", text='" + text + '\'' +
                ", ace='" + ace + '\'' +
                '}';
    }
}
