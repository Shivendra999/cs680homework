package umbcs680.hw1;
public class Calculator {

    public float performMultiplication(float operand1, float operand2) {
        return operand1 * operand2;
    }

    public float performDivision(float dividend, float divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}
