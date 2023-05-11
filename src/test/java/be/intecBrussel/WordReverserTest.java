package be.intecBrussel;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WordReverserTest {
    @Test
    void testReverseWord() {
        WordReverser wordReverser = new WordReverser("Hello");

        String reversedWord = wordReverser.reverseWord("Hello");
        assertEquals("olleH", reversedWord);
    }
}