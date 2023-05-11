package be.intecBrussel;

import java.util.Scanner;

public class Calculator {
    public String checkNumberPosNeg(String input) {
        if (input == " ") {
            return "Result is empty";
        } else {
            int nr1 = Integer.parseInt(input);
            if (nr1 > 0) {
                return "The number is positive.";
            } else if (nr1 < 0) {
                return "The number is negative.";
            } else { // nr1 == 0
                return "The number is zero.";
            }
        }
    }
    public String checkNumberEvOd(Integer number) {
        if (number == null) {
            return "Empty space.";
        } else if (number %2 ==0){
            return "The number is even.";
        }else {
            return "The number is odd.";
        }
    }

}
