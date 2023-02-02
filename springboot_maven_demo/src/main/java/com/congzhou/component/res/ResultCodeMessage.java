package com.congzhou.component.res;

public enum ResultCodeMessage {
    SUCCESS(0, "请求成功"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private int code;
    private String message;


    ResultCodeMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
