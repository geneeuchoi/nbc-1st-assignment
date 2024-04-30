package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    private double result = 0;
    private Queue<Double> resultQueue;

    public ArithmeticCalculator(Queue<Double> resultQueue) {
        this.resultQueue = resultQueue;
        resultQueue.clear();
    }

    public void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("분모에 0을 입력하셨습니다.");
                } else {
                    result = num1 / num2;
                }
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

