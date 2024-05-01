package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    private double result = 0;

    private final AddOperation addOperator;
    private final SubtractOperation subtractOperator;
    private final MultiplyOperation multiplyOperator;
    private final DivideOperation divideOperator;
    private final ModOperation modOperator;

    public ArithmeticCalculator(Queue<Double> resultQueue, AddOperation addOperator, SubtractOperation subtractOperator, MultiplyOperation multiplyOperator, DivideOperation divideOperator, ModOperation modOperator) {
        super(resultQueue);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
        this.modOperator = modOperator;
    }

    public void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                result = divideOperator.operate(num1, num2);
                break;
            case '%':
                result = modOperator.operate(num1, num2);
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

