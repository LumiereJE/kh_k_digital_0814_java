package 조건문_코테;
import java.util.Scanner;

/*
세자리의 정수를 입력 받아 가장 큰 수를 출력
*/
public class Test_2st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3자리 정수 입력 : ");
        int num = sc.nextInt();

        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        //숫자 3개 비교..
        if (a > b) {
            System.out.print("a가 가장 큽니다.");
        } else if (b > c) {
            System.out.print("b가 가장 큽니다.");
        } else if (a < c) {
            System.out.print("c가 가장 큽니다.");
        } else {
            System.out.print("몰겟슴다.");
        }
    }

}
