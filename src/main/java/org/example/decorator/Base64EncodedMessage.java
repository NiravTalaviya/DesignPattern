package org.example.decorator;

public class Base64EncodedMessage extends Message {
    private Message msg;
    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "Pseudo encoded into Base64 -> " + msg.getContent() ;
    }
}
