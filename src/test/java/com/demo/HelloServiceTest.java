package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {
    @Test
    void sayHelloReturnsExpectedGreeting() {
        HelloService service = new HelloService();
        assertEquals("Hello, World!", service.sayHello());
    }
}

