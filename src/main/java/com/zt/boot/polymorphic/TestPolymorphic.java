package com.zt.boot.polymorphic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@Component
@SpringBootTest
public class TestPolymorphic {

    @Autowired
    @Qualifier("man")
    private Person person;

    @Test
    void test() {
        person.eat();
    }
}
