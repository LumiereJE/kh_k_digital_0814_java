package 다형성;

// 부모 클래스도 extends Object 임.. 오브젝트로부터 상속 된 클래스임
public class Parent {

    protected int num = 1000000000;      // protected : 상속관계와 같은 패키지 내에서 접근 가능
    int money = 1000000;
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
