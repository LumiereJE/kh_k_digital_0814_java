package 스레드_예제5번;

/*
데몬 스레드 : 다른 스레드의 작업을 돕는 보조 스레드
            데몬 스레드 이외의 스레드가 모두 종료되면, 자동 종료. 해킹에 쓰이기도 함.
*/

import static java.lang.Thread.sleep;

public class ThMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true);         // 데몬 스레드를 만드는 방법
        autoSaveTh.start();
        sleep(30000);
    }
}

class AutoSaveTh extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){}
            save();
        }

    }
}
