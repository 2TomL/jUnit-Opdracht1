package be.intecBrussel;

public class Calculator {
    public String checkNumberPosNeg(int nr1) {
        if (nr1 > 0) {
            return "The number is positive.";
        } else if (nr1 < 0) {
            return "The number is negative.";
        } else {
            return "The number is zero.";
        }
    }
    public String checkNumberEvOd(int number) {
        if (number % 2 == 0) {
            return "The number is even.";
        } else {
            return "The number is odd.";
        }
    }
}
