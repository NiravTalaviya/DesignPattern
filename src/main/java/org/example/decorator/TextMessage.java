package org.example.decorator;

public class TextMessage extends Message {

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return this.msg;
    }
}
