package be.intecBrussel;

public class WordReverser {
    public String word;

    public WordReverser(String word) {
        this.word = word;
    }

    public String reverseWord(String wordToReverse) {
        return new StringBuilder(wordToReverse).reverse().toString();
    }
}
