package ie.atu.week8;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Integer Overflow");
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum)
    {
        if(firstNum <= Integer.MIN_VALUE || secondNum <= Integer.MIN_VALUE)
            throw new ArithmeticException("Integer Underflow");
        return firstNum - secondNum;
    }

    public int divide(int i, int i1)
    {
        if(i1 == 0)
            throw new ArithmeticException("Divide by zero");
        return i / i1;
    }

    public int multiply(int i, int i1)
    {
        long result = (long) i * (long) i1;
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer Overflow");
        }
        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer Underflow");
        }
        return (int) result;

    }


}
