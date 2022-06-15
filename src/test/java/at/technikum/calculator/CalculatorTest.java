package at.technikum.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        // arrange
        Calculator calc = new Calculator();
        int a = 5;
        int b = 10;

        // act
        int result = calc.sum(a, b);

        // assert
        assertEquals(15, result);
    }
}