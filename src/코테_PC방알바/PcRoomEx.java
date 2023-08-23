package 코테_PC방알바;
import java.util.Scanner;
/*
인원 수
예약 할 좌석 번호 1 ~ 100대
중복되는 번호가 불리는 횟수 카운트하기

손님의 수 N <= 100
.random() 사용?
*/
public class PcRoomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];        // 좌석 100번까지 만들기
        int rejectCnt = 0, seatNum;         // 거절당한 횟수 0부터 시작
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               // 인원수를 입력 받음

        for(int i = 0; i < n; i++) {
            seatNum = sc.nextInt();         // 좌석 번호 = 앉고싶은 자리 번호
            if(pcRoom[seatNum-1] == 1) rejectCnt++;   // 프로그래밍은 0부터 시작이니까 -1해줌. 0번째 자리는 없음
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);
    }
}
