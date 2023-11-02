package edu.ua.cs.cs200.lab10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralSanityTest {
    private RomanNumeral romanNumeral;

    int testNumber = 1579;

    @Before
    public void setUp() throws Exception {
        romanNumeral = new RomanNumeral(testNumber);
    }

    @Test
    public void testConvert() {
        assertEquals("MDLXXIX", romanNumeral.toString(), "300 is MDLXXIX in roman numeral");
    }

}