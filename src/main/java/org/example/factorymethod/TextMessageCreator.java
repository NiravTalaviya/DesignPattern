package org.example.factorymethod;

class TextMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
