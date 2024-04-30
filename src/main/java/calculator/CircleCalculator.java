package calculator;

import java.util.Queue;

public class CircleCalculator extends Calculator{
    private double result = 0;
    private static final double PI = 3.14;
    //private = 외부에서 접근 불가능 하도록
    //static = 인스턴스마다 공유해서 사용할 수 있도록
    //final = PI값은 변하면 안되므로 사용했다.

    private Queue<Double> resultQueue;

    public CircleCalculator (Queue<Double> resultQueue) {
        super(new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation(), new ModOperator());
        this.resultQueue = resultQueue;
        resultQueue.clear();
    }


    public void calculateCircleArea(double radius) {
        result = radius * radius * PI;
    }

    @Override
    public double getResult() {
        resultQueue.add(result);
        return result;
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
    public void removeResult(String removeTxt) {
        if (removeTxt.equals("remove")) {
            if (!resultQueue.isEmpty()) {
                resultQueue.poll();
            }
        }
    }
}
