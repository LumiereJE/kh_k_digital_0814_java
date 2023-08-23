package This에_대해서;

public class Car {

    //인스턴스 필드
    private String model;       // 자동차 명
    private int year;           // 출고 연도
    private String color;       // 색상
    private int maxSpeed;       // 최고속도

    Car() {}    // 매개변수가 없는 타입.
    Car(String model) {
        // this()를 쓰면 다른 생성자를 불러올 수 있음
        this(model, 2022, "black", 230);
    }
    Car(String model, int year, String color, int speed) {
        this.model = model;
        this.year = year;
        this.color = color;
        maxSpeed = speed;
    }
}
