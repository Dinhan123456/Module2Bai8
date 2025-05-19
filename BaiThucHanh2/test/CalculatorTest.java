import Bai1.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    void testAddition() {
        int firstOperand = 10;
        int secondOperand = 5;
        char operator = Calculator.ADDITION;
        int expected = 15;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    void testSubtraction() {
        int firstOperand = 10;
        int secondOperand = 5;
        char operator = Calculator.SUBTRACTION;
        int expected = 5;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    void testMultiplication() {
        int firstOperand = 10;
        int secondOperand = 5;
        char operator = Calculator.MULTIPLICATION;
        int expected = 50;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    void testDivision() {
        int firstOperand = 10;
        int secondOperand = 2;
        char operator = Calculator.DIVISION;
        int expected = 5;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    void testDivisionByZero() {
        int firstOperand = 10;
        int secondOperand = 0;
        char operator = Calculator.DIVISION;

        Exception exception = assertThrows(RuntimeException.class, () -> {
            Calculator.calculate(firstOperand, secondOperand, operator);
        });

        assertEquals("Can not divide by 0", exception.getMessage());
    }

    @Test
    void testUnsupportedOperator() {
        int firstOperand = 10;
        int secondOperand = 5;
        char operator = '%'; // Unsupported

        Exception exception = assertThrows(RuntimeException.class, () -> {
            int calculate = Calculator.calculate(firstOperand, secondOperand, operator);
        });

        assertEquals("Unsupported operation", exception.getMessage());
    }
}
