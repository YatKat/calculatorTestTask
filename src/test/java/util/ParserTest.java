package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void performMathOperationCorrectPlusOper() {
        int actualResult = Parser.performMathOperation("24 + 12");
        assertEquals(36, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performMathOperationIncorrectInput() {
        Parser.performMathOperation("2412");
    }

    @Test(expected = IllegalArgumentException.class)
    public void performMathOperationEmptyInput() {
        Parser.performMathOperation("");
    }

    @Test
    public void performMathOperationCorrectMinusOper() {
        int actualResult = Parser.performMathOperation("24 - 12");
        assertEquals(12, actualResult);
    }

    @Test
    public void performMathOperationCorrectNegativeResult() {
        int actualResult = Parser.performMathOperation("24 - 78");
        assertEquals(-54, actualResult);
    }

}