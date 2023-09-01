package 스레드_예제3번;

/*
Thread간의 협업
: wait(), notify(), notifyAll()

notiry() : 일시정지 상태 → 실행 대기 상태로 변경
wait() : 자신을 일시정지 상태로 만듦.
*/

public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    // synchronized : 멀티스레드 환경에서 임계영역에 접근을 방지하는 역할 (Lock / unlock) 제공
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify();       // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦.
        try {
            wait();     // 상대를 깨워놓고 자기는 잠드는거임. -> 순서가 교차됨.
        } catch (InterruptedException e) {}
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify();       // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦.
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}

class ThreadA extends Thread {
    final private WorkObject workObject;      //
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;       // 주소를 받음
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    final private WorkObject workObject;      //
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}

