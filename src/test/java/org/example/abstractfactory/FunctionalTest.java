package org.example.abstractfactory;

import org.junit.jupiter.api.Test;

class FunctionalTest {
    private ResourceFactory factory;

    @Test
    void happy_test() {
        factory = new AwsResourceFactory(); // This can be injected dynamically i.e, Spring Bean
        Instance i = factory.createInstance();
        Storage s = factory.createStorage();
        i.attachStorage(s);
        i.start();
        i.stop();
    }
}
