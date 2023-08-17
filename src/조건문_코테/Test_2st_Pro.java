package 조건문_코테;
import java.util.Scanner;
public class Test_2st_Pro {

    public static void main(String[] args) {
        int num;    // 100의 자리 정수를 입력 받기 위한 변수
        int a, b, c;    // 100, 10, 1의 자리 값을 담기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("백의 자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100;      // 100으로 나눈 몫을 담음
        b = (num % 100) / 10;   // 100으로 나눈 나머지를 다시 10으로 나누어서 담음
        c = num % 10;       // 10으로 나눈 나머지를 담음

    // 방법 1
        if(a > b) {
            if(a > c)   System.out.println(a);
            else System.out.println(c);
        } else {
            if(b > c) System.out.println(b);
            else System.out.println(c);
        }
    /*  방법 2
        if(a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b, c));
        }
    */
    }
}
