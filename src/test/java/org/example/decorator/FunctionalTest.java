package org.example.decorator;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

class FunctionalTest {

    @Test
    void happyCase() {
        Message m = new TextMessage("Demo");
        System.out.println(m.getContent());

        Message decorate = new HtmlEncodedMessage(m);
        System.out.println(decorate.getContent());

        decorate = new Base64EncodedMessage(decorate);
        System.out.println(decorate.getContent());
    }
}
