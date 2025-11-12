package ie.atu.week8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setup()
    {
        calc = new Calculator();
    }


    @Test
    public void testAdd_Success()
    {
        assertEquals(8,calc.add(4,4));
    }

    @Test
    public void testSubtract_Success()
    {
        assertEquals(0,calc.subtract(5,5));
    }

    @Test
    public void testDivide_Success()
    {
        assertEquals(4,calc.divide(16,4));
    }

    @Test
    public void testMultiply_Success()
    {
        assertEquals(64,calc.multiply(16,4));
    }

    @Test
    public void testAdd_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Integer Overflow",ex.getMessage());
    }

    @Test
    public void testSubtract_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.subtract(Integer.MIN_VALUE, 1));
        assertEquals("Integer Underflow",ex.getMessage());
    }

    @Test
    public void testDivide_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.divide(Integer.MAX_VALUE, 0));
        assertEquals("Divide by zero",ex.getMessage());
    }

    @Test
    public void testMultiply_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.multiply(Integer.MAX_VALUE, 2));
        assertEquals("Integer Overflow",ex.getMessage());
    }



}
