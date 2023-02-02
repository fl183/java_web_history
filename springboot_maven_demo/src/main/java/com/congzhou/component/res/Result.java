package com.congzhou.component.res;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(ResultCodeMessage resultCodeMessage){
        this.code = resultCodeMessage.getCode();
        this.msg = resultCodeMessage.getMessage();
    }

    public Result(ResultCodeMessage resultCodeMessage, T data){
        this.code = resultCodeMessage.getCode();
        this.msg = resultCodeMessage.getMessage();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
