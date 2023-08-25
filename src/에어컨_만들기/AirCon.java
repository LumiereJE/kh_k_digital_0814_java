package 에어컨_만들기;
import java.util.Scanner;

/*
1. 전원 On / Off
2. 온도 설정 기능 - 1도씩
3. 현재 온도 표시 기능
4. Cooler On / Off
5. Heater On / Off
6. 바람세기 : 1단 / 2단 / 3단

*/

import java.util.Calendar;

public class AirCon {
    private boolean isPower;            // on / off
    private int setTemp;                // 온도 설정
    private int currTemp;               // 현재 온도
    private boolean isCooler;           // 냉방기
    private boolean isHeater;           // 난방기
    private int windStep;               // 1단, 2단, 3단

    // 생성자 ---------------------------------------------------------------------
    AirCon() {

        // 에어컨의 현재 온도를 보여주기 위한 값, 달 별 평균 기온 입력
        final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};             // 변하지 않을 고정된 값 final.
        Calendar now = Calendar.getInstance();      // 캘린더 클래스를 불러와서 사용
        int month = now.get(Calendar.MONTH);        // 배열의 인덱스와 동일하게 0이면 1월임. 대문자로 시작하면 static 메서드임.
        currTemp = MONTHTEMP[month];                // 배열에 설정한 온도 정보를 가져옴. 진짜 지금 운영체제의 현재 날짜를 가져와서 위에 설정해 둔 평균 온도를 가져옴.

        // 인스턴스 필드 초기화
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    // 출력 ----------------------------------------------------------------------
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }

    // 에어컨 상태 설정 -------------------------------------------------------------
    public void setAirConState() {

        // 설정온도
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + " 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");

        // 바람세기 ------------------------------------------------------------------
        System.out.print("바람 세기를 설정 하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) {        // 설정 온도가 현재 온도보다 낮은 상태 = 더운상태
            System.out.println("Cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp) { // 설정 온도가 현재 온도보다 높은 상태 = 추운상태
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;           // 둘다 꺼버림
            isHeater = false;
        }
    }

    // 전원 상태 --------------------------------------------------------
    public void setPower(boolean power) {
        isPower = power;
    }

    // 현재 에어컨 몇단계인지 확인
    public int getWindStep() {
        return windStep;
    }

    // 켜져 있어? ?? ? ? ? -----------------------------------------------
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }

    // 온도 변경 -----------------------------------------------------------
    public void setCurrTemp(int n) {        // 매개변수의 정수값을 받아 현재 온도를 변경해 줌
        currTemp += n;
    }

    // 현재 온도는? ---------------------------------------------------------
    public int getCurrTemp() {
        return currTemp;
    }

    // 설정 온도를 읽음 ------------------------------------------------------
    public int getSetTemp() {
        return setTemp;
    }

}
