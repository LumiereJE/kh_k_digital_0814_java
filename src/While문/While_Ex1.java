package While문;
import java.util.Scanner;
/*
    while
    주어진 조건이 참인 동안 해당 블록{ }을 반복 수행, 주로 반복 횟수를 알 수 없는 경우에 사용함

*/
public class While_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 값을 입력받기 위해 스캐너를 생성
        System.out.print("정수를 입력 하세요 : ");
        int n = sc.nextInt();
        int sum = 0;                                // 합계를 구한 변수를 초기화
//        while (n > 0) {           // 0이 될 때 까지 반복
//            sum += n;           // sum = sum + n;
//            n--;                // 입력 받은 값을 1씩 감소 시킴 → 내림차순
//        }
//----------------------------------------------------------------------------------
        // 위의 while문과 똑같은 식
        // for(초기식; 조건식; 증감식)
        for(int i = 1; i <= n; i++) {       // i를 1부터 n이하까지 1씩 증가하면서 더해라
            sum += i;
        }

        System.out.println("주어진 정수의 합 : " + sum);
    }
}
// 지역변수 특징 : 할당했을 때 메모리를 소비하지 않음
//               범위를 벗어나면 자동으로 포멧 됨 → 자동 소멸됨