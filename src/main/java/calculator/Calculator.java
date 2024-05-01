package calculator;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    public abstract void removeResult(String removeTxt);
    public abstract void inquiryResults(String inquiryTxt);
    public abstract double getResult();
    protected Queue<Double> resultQueue;

    public Calculator(Queue<Double> resultQueue) {
        this.resultQueue = resultQueue;
    }

}


