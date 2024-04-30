package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private int result = 0;

    // 공백 큐 만들기 q.clear
    public Calculator(Queue<Integer> resultQueue) {
        resultQueue.clear();
    }


    public void calculte(int num1, int num2, char operator) {
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

}
