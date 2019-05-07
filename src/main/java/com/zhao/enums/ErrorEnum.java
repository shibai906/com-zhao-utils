package com.zhao.enums;

public enum ErrorEnum {

    SERVER(100,"服务器异常"),
    BUSINESS(10,"业务逻辑错误");

    public int code ;
    public String errorMessage ;



    private ErrorEnum(int code,String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public static String getName(int code) {
        for (ErrorEnum error : ErrorEnum.values()) {
            if(error.code == code) {
                return error.errorMessage;
            }
        }
        return null;
    }

}
