package com.congzhou.action;

import com.congzhou.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloController extends ActionSupport{
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
