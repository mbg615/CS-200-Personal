package edu.ua.cs.cs200.lab10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanExceptionNumeralTest {

    int testNumber = -30;

    @Test
    public void testConvert() {
        assertThrows(NumberFormatException.class, () -> new RomanNumeral(-30));
    }
}