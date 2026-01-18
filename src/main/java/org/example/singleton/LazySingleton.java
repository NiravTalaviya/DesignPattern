package org.example.singleton;

class LazySingleton {
    private LazySingleton() {

    }

    // Volatile means - Java won't use cached value of this instance.
    private static volatile LazySingleton instance;

    static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) { // Two processes might be executing this part of code simultaneously.
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
