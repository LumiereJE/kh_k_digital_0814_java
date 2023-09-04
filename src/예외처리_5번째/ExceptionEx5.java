package 예외처리_5번째;

/*
예외처리 미루기
*/

import java.io.IOException;

public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        test.input();
    }
}


class IOSample {
    private int num;
    public void input() {

        try {
            num = System.in.read();     // 저수준 입력이라 예외처리가 필요
        } catch (IOException e) {

        }

    }
    public void output() {
        System.out.println(num);
    }
}

