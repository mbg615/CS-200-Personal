package edu.ua.cs.cs200.lab10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralSuccessTest {
    private RomanNumeral romanNumeral;

    int testNumber = 300;

    @Before
    public void setUp() throws Exception {
        romanNumeral = new RomanNumeral(testNumber);
    }

    @Test
    public void testConvert() {
        assertEquals("CCC", romanNumeral.toString(), "300 is CCC in roman numeral");
    }

}