package com.example.awsjava.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyControllerTest {

    @Test
    void dummy() {
        DummyController dummyController = new DummyController();
        String result = dummyController.dummy();
        assertEquals("Hello World!", result);
    }
}