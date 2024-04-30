package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Queue<Integer> resultQueue = new LinkedList<>();

        while (flag) {
            System.out.println("첫 번째 숫자를 입력하세요.");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요.");
            char operator = sc.next().charAt(0);
            int result = 0;
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
            System.out.println("결과: " + result);
            resultQueue.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            String removeTxt = sc.next();
            if (removeTxt.equals("remove")) {
                if (!resultQueue.isEmpty()) {
                    resultQueue.poll();
                }
            }
            System.out.println("저장된 연산 결과를 조회하시겠습니까?(inquiry 입력 시 조회");
            String inquiryTxt = sc.next();
            if (inquiryTxt.equals("inquiry")) {
                for (Integer i : resultQueue) {
                    System.out.println(i);
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitTxt = sc.next();
            if (exitTxt.equals("exit")) {
                flag = false;
            }
        }
    }

}

