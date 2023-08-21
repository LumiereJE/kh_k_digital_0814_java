package 코테_조건식;
import java.util.Scanner;
public class AlarmEx1 {
    public static void main(String[] args) {
        /*
            - 시간과 분을 입력 받기 위한 스캐너 생성
            - 시간과 분을 각각 입력 받음
            - 45분을 빼야 되므로 시간과 분을 총 몇 분인지 환산 함
            - 계산된 시간이 45분 보다 작으면 하루 전날 이므로 하루의 시간 만큼 더해줌
            - 계산된 시간에서 45를 빼줌
            - 결과를 시간과 분으로 환산해서 출력 해줌
        */
//        int hour, min;                                          // 변수선언
//        int calc;

        Scanner sc = new Scanner(System.in);
        System.out.print("기상시간 (hour min) : ");            // hour, min 받기
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int totalMin = hour * 60 + min;                         // 단위 통합, 시간 → 분으로 변환해서 계산
        if (totalMin < 45) {
            totalMin = 24 * 60 + totalMin;                      // 24시간 넘어감
        }
        totalMin -= 45;
        System.out.println((totalMin / 60) + "시 " + (totalMin % 60) + "분");
    }
}
