package org.example.factorymethod;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }
}
