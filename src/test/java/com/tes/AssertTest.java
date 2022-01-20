package com.tes;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }
    @Test
    public void testAssertNotNull(){
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = 765;
        assertSame(aNumber, aNumber);
    }

}
