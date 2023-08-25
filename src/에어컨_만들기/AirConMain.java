package 에어컨_만들기;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {

        // 실제로 동작시켜보기
        AirCon lgAirCon = new AirCon();
        int elapsedTime = 0;                       // 경과 시간을 계산 하기 위한 변수
        boolean isSetTemp = false;                  // 온도를 변경 할 조건인지 판단하는 변수

        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까? ( yes / no ) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);        // 에어컨 켜기
            lgAirCon.setAirConState();      // 온도 설정
            while(true) {
                sleep(1000);                 // 1초마다 한번씩 돌리게.
                elapsedTime++;                    // 1초마다 1씩 증가.
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break; // 바람세기 1단
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break; // 바람세기 2단
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break; // 바람세기 3단
                    default: if(elapsedTime >= 61) isSetTemp = true;
                }
                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();      // 우리는 액정이 없으니까, 액정대신 보여줄 부분.
                    isSetTemp = false;          // 한번 온도 변경 해주면 다음 조건이 들어올때까지 해당 값으로 초기화 해줌
                    elapsedTime = 0;
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
