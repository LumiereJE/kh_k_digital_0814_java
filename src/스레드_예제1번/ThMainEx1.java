package 스레드_예제1번;

/*
하나의 프로그램 내에서 여러가지 일을 동시에 수행하는 것
*/

public class ThMainEx1 {
    public static void main(String[] args) {
        // Thread class를 상속 받아서 Thread를 생성 ---------------------------------------------------
        Thread testTh = new CustomThread();
        testTh.start();             // start = 시작해달라고 요청. 권한은 운영체제가 갖고있음.


        // Runnable 인터페이스를 implements로 상속 받아서 Thread를 만드는 방법 ----------------------------
        Runnable runTask = new InterThread();     // 실제 작업 내용을 가지고 있지만 실제 스레드 객체는 아님
        Thread runTh1 = new Thread(runTask);      // 실제 스레드를 만들어서 넣어줌.
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();

        // 익명의 객체로 Thread를 만드는 방법 → 자주 이용되는 방법 -----------------------------------------
        Runnable task = new Runnable() {
            @Override                       // 객체를 가질 수 없는 추상화를 소유한 인터페이스라서 오버라이드 해야 객체를 가질 수 있음.
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("상속받은 스레드 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread anonnyTh1 = new Thread(task);
        anonnyTh1.start();


        // 람다식으로 쓰레드를 구현하기 ------------------------------------------------------------------
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("상속받은 스레드 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread anonnyTh2 = new Thread(task);
        anonnyTh1.start();

    }
}

// 상속 받아서 스레드 만드는 방법 -> 좋진않음. only스레드 상속을 위해 그 외의 일은 못하게 됨.
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 스레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}


class InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}