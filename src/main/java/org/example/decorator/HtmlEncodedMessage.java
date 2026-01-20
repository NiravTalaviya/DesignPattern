package org.example.decorator;

public class HtmlEncodedMessage extends Message {

    private Message msg;
    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "Pseudo encoded into HTML -> " + msg.getContent() ;
    }
}
