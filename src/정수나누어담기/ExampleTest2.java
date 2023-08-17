package 정수나누어담기;
import java.util.Scanner;

// 100의 자리 정수를 입력받아서 3개의 변수에 나누어 대입하기
public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");   // 236
        int num = sc.nextInt();
        int a = num / 100;              // 100으로 나눈 몫을 구함
        int b = (num % 100) / 10;       // 100으로 나눈 나머지에서 다시 10으로 나눈 몫을 취함
        int c = num % 10;               // 23의 6이라는 나머지를 취함

        System.out.println("100의 자리 : " + a + ", 10의 자리 : " + b + ", 1의 자리 : " + c);
    }
}
