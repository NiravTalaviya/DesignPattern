package org.example.prototype;

import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    public void happyCase() throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(4);
        s1.attack();

        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println(s2);
    }
}