package be.intecBrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testPositiveNumber() {
        int number1 = 10;
        String result1 = calculator.checkNumberPosNeg(number1);
        System.out.println("Number 1: " + result1);
    }

    @Test
    public void testNegativeNumber() {
        int number2 = -10;
        String result2 = calculator.checkNumberPosNeg(number2);
        System.out.println("Number 2: " + result2);
    }

    @Test
    public void testZeroNumber() {
        int number3 = 0;
        String result3 = calculator.checkNumberPosNeg(number3);
        System.out.println("Number 3: " + result3);
    }

    @Test
    public void testCheckNumberEvOdisEven() {
        int number4 = 7;
        String result4 = calculator.checkNumberEvOd(number4);
        System.out.println("Number 4: "+result4);
    }
    @Test
    public void testCheckNumberEvOdisOdd() {
        int number5 = 20;
        String result5 = calculator.checkNumberEvOd(number5);
        System.out.println("Number 5" + result5);
    }
}