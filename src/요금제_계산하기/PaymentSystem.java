package 요금제_계산하기;
import java.util.Scanner;
/*
영식 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
민식 요금제 : 60초당 15원
첫번째 줄에 통화의 횟수(20회 미만), 두번째 줄에 통화당 통화 시간(초단위)
출력은 싼 요금제를 출력 영식 요금제는 Y60, 민식 요금제는 M45
총 통화 요금이 같은 경우는 YM 총 통화 요금 표시
*/
public class PaymentSystem {

    public static void main(String[] args) {
        int[] call = new int[20];       // 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();         // 통화 횟수를 입력 받아, 변수에 대입
        for(int i = 0; i < cnt; i++) {  // 통화 횟수 당 통화 시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10;        // 30초당 1통화로 통화 누적, 기본 한 통화 깔고 들어가야함
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if(yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("YM " + yPay);
        }

    }

}
