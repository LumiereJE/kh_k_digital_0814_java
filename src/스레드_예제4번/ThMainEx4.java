package 스레드_예제4번;

import java.nio.channels.ScatteringByteChannel;

import static java.lang.Thread.sleep;

/*
스레드를 안전하게 종료하기
stop()메서드는 사용 중지 됨.
*/
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            sleep(3000);

        } catch(InterruptedException e) {}
        RunThread.interrupted();

    }
}

class RunThread extends Thread {
//    private boolean stop;           // stop 플래그 설정
//
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }
    @Override
    public void run() {

        try {
            while (true) {      // false인 동안 죽이는 방법.
                System.out.println("Thread 실행 중. . . . .. . .");
                sleep(1); // 열어준다
            }
        } catch(InterruptedException e) {
            System.out.println(" 인터럽트 발생 !!!!!!!");
        }


        System.out.println("자원 정리. .....");
        System.out.println("실행 종료. . .. ");
    }
}

