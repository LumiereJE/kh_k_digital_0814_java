package 상속기본;
/*
 상속 : 자식 클래스가 부모 클래스의 기능을 물려 받는 것 (필드와 메서드)
키워드 : extends
*/
public class InheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("poppy");
//        dog.sleep();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep(10);
    }
}
