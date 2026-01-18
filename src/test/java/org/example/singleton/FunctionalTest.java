package org.example.singleton;

import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    void eagerRegistry() {
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        System.out.println(eagerRegistry);
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry1);
    }

    @Test
    void lazyRegistry() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
