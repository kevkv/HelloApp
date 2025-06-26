package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testCreateGreeting() {
        assertEquals("Witaj, Kevin!", HelloApp.createGreeting("Kevin"));
        assertEquals("Witaj, nieznajomy!", HelloApp.createGreeting(""));
        assertEquals("Witaj, nieznajomy!", HelloApp.createGreeting(null));
    }
}
