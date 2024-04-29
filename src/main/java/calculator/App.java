package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요.");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 == 0) {
                System.out.println("분모에 0을 입력하셨습니다.");
                } else {
                    result = num1 * num2;
                }
                break;
            default:
                System.out.println("연산자를 잘 못 입력하셨습니다.");
        }
        System.out.println("결과: " + result);
    }
}
