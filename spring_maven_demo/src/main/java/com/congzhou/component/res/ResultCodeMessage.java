package com.congzhou.component.res;

public enum ResultCodeMessage {
    SUCCESS(0, "成功"),
    FAIL(10001, "失败");

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
