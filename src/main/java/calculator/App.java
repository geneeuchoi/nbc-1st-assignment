package calculator;

import java.util.Scanner;

public class App {
    private static final int MAX_RESULTS = 10;
    private static int[] resultArr = new int[MAX_RESULTS];
    private static int currentIndex = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

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
            addResult(result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                flag = false;
            }
        }
    }
    private static void addResult(int result) {
        if (currentIndex < MAX_RESULTS) {
            resultArr[currentIndex] = result;
            currentIndex++;
        } else {
            // 배열이 가득 찼을 경우, 이전 값들을 한 칸씩 뒤로 이동
            for (int i = 0; i < MAX_RESULTS - 1; i++) {
                resultArr[i] = resultArr[i + 1];
            }
            resultArr[MAX_RESULTS - 1] = result; // 마지막 인덱스에 새로운 결과 저장
        }
    }
}

