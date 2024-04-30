package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    private double result = 0;
    private Queue<Double> resultQueue;

    public ArithmeticCalculator(Queue<Double> resultQueue) {
        super(new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation(), new ModOperator());
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
                System.out.println("연산자를 잘 못 입력하셨습니다.");
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
            for (Double i : resultQueue) {
                System.out.println(i);
            }
        }
    }
    @Override
    public double getResult() {
        resultQueue.add(result);
        return result;
    }
}

