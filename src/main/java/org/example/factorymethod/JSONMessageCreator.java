package org.example.factorymethod;

class JSONMessageCreator  extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
