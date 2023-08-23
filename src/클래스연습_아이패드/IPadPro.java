package 클래스연습_아이패드;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.Thread.sleep;
import static 클래스연습_아이패드.Common.*;

public class IPadPro {
    int screen;     // 11", 12.9"
    int color;      // 스페이스 그레이, 실버
    int memory;     // 128GB, 256GB, 512GB, 1TB
    int network;    // WiFi only, WiFi+cellular
    String name;    // 각인 서비스 이용할 시, 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum;   // 제품 일련 번호 : 제품의 고유값(유일한)
    static int cnt = 0; // 클래스 소속의 변수, 몇 대가 생산 되었는지 확인.
                        // 즉 클래스가 객체로 만들어진 횟수.

    // 디폴트 서식 틀 생성
    IPadPro(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");  //시리얼 넘버용. MM이 대문자인 이유 : mm이 minute으로 쓰임.
        productDate = sdf.format(now);          // 생성자가 만들어질때 = 제품이 생성될 때의 년/월/일을 넘어옴.
        cnt++;                                  // 생산 갯수 count.
        productDate += cnt;                     // 문자열에 생산대수를 이어붙이기
    }
     // 제품 구매 할? 말?
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5 )+ "iPad Pro 구입하기" + "=".repeat(5));
        System.out.println("구입하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();          // 구입을 계속 하려면 yes 버튼 정보받기
        if(isContinue.equalsIgnoreCase("yes")) return true;     // 구입을 진행함.
        else return false;                                                  // 구입을 하지 않음.
    }

    // 화면 사이즈 정하기
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 : [1] 11인치 [2] 12.9인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return;      // return으로 반환하진 않지만 빠져나갈순 있음
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }

    // 컬러
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 : [1] 스페이스그레이 [2] 실버 : ");
            color = sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택 하세요.");
        }
    }

    // 메모리
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 : [1]128GB [2]256GB [3]512GB [4]1TB : ");
            memory = sc.nextInt();
            if(memory > 0 &&  memory < 5) return;
            System.out.println("용량을 다시 선택 하세요.");
        }
    }

    // 네트워크
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 : [1]WiFi only  [2]WiFi+cellular : ");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }

    // 각인 서비스
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes / no) : ");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력하세요 : ");
            name = sc.next();
        }
    }

    // 시리얼넘버!!!
    void setSerialNum () {
        String screenStr = (screen ==1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;     // 일련번호 생성
    }

    void progressPad() throws InterruptedException {    // sleep으로 자고있기 때문에 중간에 가로챌 수 있게 하기 위함
        int cnt = 0;
        while (true) {
            sleep(300);             // 사람 눈에 보일정도로 속도 맞추기
            cnt++;                        // 0.3초마다 cnt가 바뀌도록 설정
            System.out.print("<< iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");         // 커서 앞으로 땡기기.
            if(cnt >= 100) break;
        }
    }

    void productPad() {
//        final String[] screenType = {"", "11인치", "12.9인치"};
//        final String[] colorType = {"", "스페이스그레이", "실버"};
//        final String[] memType = {"", "128GB", "256GB", "512GB"};
//        final String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};
        System.out.println("=".repeat(5) + "iPad Pro 사양" + "=".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("-".repeat(40));
    }


}
