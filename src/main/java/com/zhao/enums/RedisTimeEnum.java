package com.zhao.enums;

public enum RedisTimeEnum {

    TIME_ENUM(23);

    private int value ;

    private RedisTimeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
