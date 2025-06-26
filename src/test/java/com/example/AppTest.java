package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testCreateGreeting() {
        assertEquals("Cześć, Kevin!", HelloApp.createGreeting("Kevin"));
        assertEquals("Cześć, nieznajomy!", HelloApp.createGreeting(""));
        assertEquals("Cześć, nieznajomy!", HelloApp.createGreeting(null));
    }
}
