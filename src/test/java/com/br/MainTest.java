package com.br;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testPrintHelloWorld() {
        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method to be tested
        Main.printHelloWorld();

        // Reset System.out
        System.setOut(System.out);

        // Check the printed output
        assertEquals("Hello world!\n", outputStream.toString());
    }
}
