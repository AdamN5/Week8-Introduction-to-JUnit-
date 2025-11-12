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


}
