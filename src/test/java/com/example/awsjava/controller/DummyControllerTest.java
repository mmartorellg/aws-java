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

    @Test
    void dummyPost() {
        DummyController dummyController = new DummyController();
        String result = dummyController.dummyPost();
        assertEquals("Hello World from Post!", result);
    }

    @Test
    void dummyWithPathVariable() {
        DummyController dummyController = new DummyController();
        String name = "Alice";
        String result = dummyController.dummyWithPathVariable(name);
        assertEquals("Hello Alice", result);
    }
}