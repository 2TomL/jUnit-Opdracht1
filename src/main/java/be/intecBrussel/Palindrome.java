package be.intecBrussel;

public class Palindrome {
    public String word;

    public Palindrome(String word) {
        this.word = word;
    }

    public boolean isPalindrome() {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
