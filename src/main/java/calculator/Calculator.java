package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private int result = 0;
    private double area = 0;
    private static final double PI = 3.14;
    //private = 외부에서 접근 불가능 하도록
    //static = 인스턴스마다 공유해서 사용할 수 있도록
    //final = PI값은 변하면 안되므로 사용했다.

    // 공백 큐 만들기 q.clear
    public Calculator(Queue<Integer> resultQueue) {
        resultQueue.clear();
    }



    public void calculate(int num1, int num2, char operator) {
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
    public void removeResult(String removeTxt, Queue<Integer> resultQueue) {
        if (removeTxt.equals("remove")) {
            if (!resultQueue.isEmpty()) {
                resultQueue.poll();
            }
        }
    }

    public void inquiryResults(String inquiryTxt, Queue<Integer> resultQueue) {
        if (inquiryTxt.equals("inquiry")) {
            for (Integer i : resultQueue) {
                System.out.println(i);
            }
        }
    }
    public int getResult() {
        return result;
    }

    public void calculateCircleArea(double radius) {
        area = radius * radius * PI;
    }

    public double getArea() {
        return area;
    }

    public void inquiryAreas(Queue<Double> areaQueue) {
            for (Double area : areaQueue) {
                System.out.println(area);
            }
    }

}
