package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

// Animal을 상속 받아 Dog클래스를 만듦.
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

// 이렇게 되면 dog + animal 클래스들의 상속을 모두 받음
class HouseDog extends Dog {    // 오버라이딩
    void sleep() {      // 있던거 재정의 함
        System.out.println(this.name + " zzz in house.");
    }
    void sleep(int hour) {      // 오버로딩
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }

}