package com.sollidsoft.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Reidar Sollid
 * Date: 25.04.11
 * Time: 23.59
 */
public class RomanNumbersTest {
    @Test
    public void testToRoman() throws Exception {
        String expected = "II";
        String actual = RomanNumbers.toRoman(2);
        assertEquals(expected, actual);

        expected = "V";
        actual = RomanNumbers.toRoman(5);
        assertEquals(expected, actual);

        expected = "X";
        actual = RomanNumbers.toRoman(10);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanMinus() {
        String expected = "IX";
        String actual = RomanNumbers.toRoman(9);
        assertEquals(expected, actual);

        expected = "XI";
        actual = RomanNumbers.toRoman(11);
        assertEquals(expected,actual);
    }

    @Test
    public void testMixed() {
        String expected = "XXIV";
        String actual = RomanNumbers.toRoman(24);
        assertEquals(expected, actual);
    }

    @Test
    public void testEnumGetHighest(){
        RomanNumbers.Romans expected = RomanNumbers.Romans.X;
        RomanNumbers.Romans actualRomans = RomanNumbers.Romans.getHighest(24);
        assertEquals(expected,actualRomans);

    }
}
