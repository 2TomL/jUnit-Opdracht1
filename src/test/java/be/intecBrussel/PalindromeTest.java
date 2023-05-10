package be.intecBrussel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void IsEenPalindroom() {
        assertTrue(new Palindrome("deed").isPalindrome());
    }
    @Test
    public void IsGeenPalindrrom() {
        assertFalse(new Palindrome("vork").isPalindrome());
    }
}