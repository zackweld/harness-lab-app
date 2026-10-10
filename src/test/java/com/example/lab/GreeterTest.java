package com.example.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    void messageIncludesVersion() {
        assertTrue(Greeter.message("2").contains("version 2"));
    }

    @Test
    void messageEndsWithNewline() {
        assertEquals("Hello from the Harness lab app, version 1\n", Greeter.message("1"));
    }
}
