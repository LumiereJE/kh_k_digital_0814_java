package 다형성;

public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();


        // 매개변수의 다형화
        Parent p = new Child();     // 부모 클래스의 참조변수로 자식객체를 접근함.
        p.display();                // display()는 어느게 불려질까?? → 자식꺼가 불려짐. 오버라이딩 된 게 먼저 불리게 됨.




    }
}


