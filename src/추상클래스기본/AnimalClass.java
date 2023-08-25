package 추상클래스기본;

import 상속기본.Animal;

/*
추상 클래스
: 클래스 앞에 abstract키워드를 붙여서 만들 수 있음.
: 추상 클래스는 객체화가 안됨.
: 내부에 0개 이상의 추상 메서드가 포함되어 있음
: 추상 메서드는 반드시 상속받는 클래스에서 오버라이딩 해줘야 함 → 해당 메서드의 기능을 구체화 시킴.
: 최소한의 인터페이스만 공유, 이름만 상속받는 느낌으로.
*/
public abstract class AnimalClass {
    // 추상화가 되면 객체를 못만들게 됨.
    // void ();         → 실체없이 이름만 있음. 앞에 abstract 붙여줘야 함 = 추상 메서드
    // void cry() {}    → 실체가 있음

    abstract void cry();    // 추상 메서드 : 상속받은 클래스에서 구체화 해줘야 함 = 오버라이딩 해줘야 함
    void sleep() {          // 일반 메서드 : 오버라이딩 해도 되고, 안해도 됨.
        System.out.println("Zzzzzzzzzz");
    }
}
// 추상 메서드를 오버라이딩으로 구체화 해주기
class Cat extends AnimalClass{
    @Override
    void cry() {
        System.out.println("냐옹냐옹!!!");
    }
    @Override
    void sleep() {
        System.out.println("ZZZZZZZZZZZZZZZ");
    }
}

class Dog extends AnimalClass {

    @Override
    void cry() {
        System.out.println("멍멍멍");
    }
}



