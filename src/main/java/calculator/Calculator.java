package calculator;

public class Calculator {
    private int result = 0;
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

    public int getResult() {
        return result;
    }

}
