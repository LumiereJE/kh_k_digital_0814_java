package 생성자_오버로딩;

public class Construct_ex {
    public static void main(String[] args) {
        Car car = new Car();        // 생성자
        car.carInfo();

        Car santafe = new Car("산타페");
        santafe.carInfo();

        Car avante = new Car("아반떼", "화이트");
        avante.carInfo();

        Car grandure = new Car("그랜저","블랙", 220);
        grandure.carInfo();

        Car tucson = new Car("투싼", "레드", 210, 170);
        tucson.carInfo();
    }
}
