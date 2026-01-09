package org.example.factorymethod;

import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    void happyTest() {
        // Using creator to create a object of "product", choice of creator determines type of product created.
        printMessage(new JSONMessageCreator());

        // Using another creator to create another "product"
        printMessage(new TextMessageCreator());
    }

    private static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
