package be.intecBrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testReturnPositiveNumber() {
        String number1 = "10";
        String result1 = calculator.checkNumberPosNeg(number1);
        System.out.println("Input: \""+number1+"Number positive: " + result1);
    }

    @Test
    public void testReturnNegativeNumber() {
        String number2 = "-10";
        String result2 = calculator.checkNumberPosNeg(number2);
        System.out.println("Input: \""+number2+"Number negative: " + result2);
    }

    @Test
    public void testReturnZeroNumber() {
        String number3 = "0";
        String result3 = calculator.checkNumberPosNeg(number3);
        System.out.println("Input: \""+number3+ "Number zero: " + result3);
    }
    @Test
    public void testReturnEmpty(){
        String input = " ";
        String result = calculator.checkNumberPosNeg(input);
        System.out.println("Input: \"" + input + "\", Result: " + result);
    }

    @Test
    public void testCheckNumberEvOdisEven() {
        int number4 = 7;
        String result4 = calculator.checkNumberEvOd(number4);
        System.out.println("Number even: "+result4);
    }
    @Test
    public void testCheckNumberEvOdisOdd() {
        int number5 = 20;
        String result5 = calculator.checkNumberEvOd(number5);
        System.out.println("Number odd: " + result5);
    }
    @Test
    public void testCheckNumberEvOdisEmptyButWillNeverBeEmptyHahaha(){
        String number6 = "Empty space.";
        String result6 = calculator.checkNumberEvOd(null);
        assertEquals(number6,result6);
    }
}