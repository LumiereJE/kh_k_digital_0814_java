package 조별실습_자동차만들기_Pro;

public class SportsCar extends Car {

    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;

    }
}
