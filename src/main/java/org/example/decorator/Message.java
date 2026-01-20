package org.example.decorator;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {
        // Add some default headers
    }

    public void encrypt() {
        // # Has some code to encrypt the content
    }
}
