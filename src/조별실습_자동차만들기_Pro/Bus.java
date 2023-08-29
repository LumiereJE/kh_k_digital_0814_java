package 조별실습_자동차만들기_Pro;

public class Bus extends Car {

    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}
