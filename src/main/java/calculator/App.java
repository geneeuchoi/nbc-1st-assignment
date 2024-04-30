package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Queue<Double> arithmeticQueue = new LinkedList<>();
        Queue<Double> circleQueue = new LinkedList<>();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(arithmeticQueue);
        CircleCalculator circleCalculator = new CircleCalculator(circleQueue);

        while (flag) {
            System.out.println("사칙 연산은 1, 원의 넓이는 2를 입력하세요.");
            char optionChoice = sc.next().charAt(0);

            switch (optionChoice) {
                case '1':
                    System.out.println("첫 번째 숫자를 입력하세요.");
                    double num1 = sc.nextInt();

                    System.out.println("두 번째 숫자를 입력하세요.");
                    double num2 = sc.nextInt();

                    System.out.println("사칙연산 기호를 입력하세요.");
                    char operator = sc.next().charAt(0);

                    //계산기 호출
                    arithmeticCalculator.calculate(num1, num2, operator);

                    //결과 호출
                    System.out.println("결과: " + arithmeticCalculator.getResult());

                    //연산결과 확인
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                    String removeTxt = sc.next();
                    arithmeticCalculator.removeResult(removeTxt);

                    //큐에 저장된 연산 결과 조회
                    System.out.println("저장된 연산 결과를 조회하시겠습니까?(inquiry 입력 시 조회)");
                    String inquiryTxt = sc.next();
                    arithmeticCalculator.inquiryResults(inquiryTxt);

                    //계산 진행 묻기
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    String exitTxt = sc.next();
                    if (exitTxt.equals("exit")) {
                        flag = false;
                    }
                    break;






                case '2':
                    System.out.println("반지름을 입력하세요.");
                    double radius = sc.nextDouble();

                    circleCalculator.calculateCircleArea(radius);

                    System.out.println("결과: " + circleCalculator.getResult());

                    System.out.println("저장된 원의 넓이 값들");
                    circleCalculator.inquiryResults("inquiry");
                    break;

                default:
                    System.out.println("잘 못 입력하셨습니다.");
            }



        }
    }

}

