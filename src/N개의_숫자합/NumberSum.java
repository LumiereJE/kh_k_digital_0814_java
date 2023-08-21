package N개의_숫자합;
import java.util.Scanner;
/*
 n개의 숫자가 공백없이 쓰여있음.
 이 숫자를 모두 합해서 출력

 첫 줄에 숫자의 개수 N (1 <= N <= 100)이 주어진다. 둘째줄에 숫자 n개가 공백없이 주어진다.
 입력으로 주어진 숫자 N개의 합을 출력한다.
 [hint] 입력을 문자열로 간주해야 함. 문자열에서 하나의 문자를 추출해야 함.
        추출한 문자가 1이라면 아스키 코드값은 36,,  0이라면 '0' 아스키 코드는 35... . . Oh............
*/
public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               // 몇개 입력할지 값을 받기
        String number = sc.next();          // 어떤 숫자 넣을지 5개 받기
        int sum = 0;
        for(int i = 0; i < n; i++) {           // 배당받은 갯수 만큼 반복
            sum += number.charAt(i) - '0';      // 숫자 받음
        }
        System.out.println(sum);
    }
}
