package 슈퍼메소드;
/*
 super : 부모의 필드나 메소드를 접근할 때 사용
 super() : 부모의 생성자를 호출
*/
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        //----super()------
        child.display();
    }
}

class Parent {
    int x = 10;
    //----super()------
    int a;
    Parent() { a = 10; }        // 기본 생성자 → 이게 불리면 값이 10이 나옴
    Parent(int n) { a = n; }    // super쓰면 활성화 됨 → 이게 불리면 값이 100이 나옴
}

// 오버라이딩
class Child extends Parent {
    int x = 20;
    void childMethod() {
        System.out.println("x : " + x);         // 자식 필드 접근
        System.out.println("x : " + this.x);    // 원래 this 숨어있었음. 매개변수일 경우는 원래것..이겠지만.
        System.out.println("x : " + super.x);   // 부모의 필드 접근
    }

    //----super()------
    int b;
    Child() {
        super(100);         // 부모의 생성자를 불러줌
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

