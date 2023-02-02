package com.congzhou.model;
import java.io.Serializable;

public class MessageStore implements Serializable{
    private String message;

    public MessageStore() {
        message = "Hello，我是数据层的内容";
    }

    public String getMessage() {
        return message;
    }
}
