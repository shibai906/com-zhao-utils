package com.zhao.utils.spring;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

public class Bean {

    @Required
    private int num;
    private String name ;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
