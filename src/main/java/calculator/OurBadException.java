package calculator;

public class OurBadException extends Exception {
    public OurBadException() {
        super("분모에 0이 들어왔습니다.");
    }
}
