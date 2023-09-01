package 코테_전자레인지;

/*
5분(300초) 버튼, 1분(60초) 버튼, 10초 버튼
최소횟수를 눌러서 요리시간을 설정하는 문제
시간을 맞출 수 없으면 -1 반환.
*/

import java.util.Scanner;

public class MicrowaveEx {
    public static void main(String[] args) {
        int t, a,b,c;   // t=요리시간(초), a=5분, b=1분, c=10초
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        if(t % 10 != 0) {
            System.out.println("-1");   // 나누어 떨어지지 않으면 -1 반환
            return;                     // else 안넣기 위함
        }
        a = t / 300;                    // 5분 버튼에 대한 몫. 5번 버튼이 눌리는 횟수
        b = t % 300 / 60;               // 1분 버튼이 눌리는 횟수
        c = t % 300 % 60 / 10;          // 10초 버튼이 눌리는 횟수
        System.out.printf("%d %d %d\n", a,b,c);


    }
}
