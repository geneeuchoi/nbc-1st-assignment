package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    private double result = 0;

    public ArithmeticCalculator(Queue<Double> resultQueue) {
        super(new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation(), new ModOperation());
        this.resultQueue = resultQueue;
        resultQueue.clear();
    }

    public void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            case '%':
                result = mod(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("연산자를 잘못 입력하셨습니다.");
            }
    }

    @Override
    public void removeResult(String removeTxt) {
        if (removeTxt.equals("remove")) {
            if (!resultQueue.isEmpty()) {
                resultQueue.poll();
            }
        }
    }

    @Override
    public void inquiryResults(String inquiryTxt) {
        if (inquiryTxt.equals("inquiry")) {
            for (Double result : resultQueue) {
                System.out.println(result);
            }
        }
    }
    @Override
    public double getResult() {
        resultQueue.add(result);
        return result;
    }
}

