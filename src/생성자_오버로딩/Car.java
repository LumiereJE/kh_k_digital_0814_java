package 생성자_오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    Car() {}        // 기본 디폴트를 하나 넣어줘서 오버로딩 시켜서 오류를 막음

    Car(String model) {              // 생성자를 만들어서 Car 정보 넣어주기
        this.model = model;          // 생성자를 따로 만들지 않으면, 기본 default 생성자가 숨어 있음
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    /*

    Car(String modelName) { // 생성자를 만들어서 Car 정보 넣어주기
    // 생성자를 따로 만들지 않으면, 기본 default 생성자가 숨어 있음
    model = modelName;
    }
    */

    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
