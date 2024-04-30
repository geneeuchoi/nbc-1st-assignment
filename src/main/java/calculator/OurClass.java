package calculator;

public class OurClass {
    private final Boolean flag = true;

    public void thisMethodIsDangerous() throws OurBadException {
        if (flag) {
            throw new OurBadException();
        }
    }
}
