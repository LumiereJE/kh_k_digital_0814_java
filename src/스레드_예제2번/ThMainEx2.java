package 스레드_예제2번;

import java.awt.*;
import static java.lang.Thread.sleep;

/*
다른 스레드의 종료를 기다림(Join())
*/

public class ThMainEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(2);       // sumThread가 작업을 완료 할 때 까지 기다림, 기다릴 시간도 부여할 수 있음.
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합계 : " + sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 2100000000; i++) {
            sum += 1;
        }
    }
}


