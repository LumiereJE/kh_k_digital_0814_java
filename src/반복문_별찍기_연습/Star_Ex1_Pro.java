package 반복문_별찍기_연습;
import java.util.Scanner;
/*
 ex) 5 입력
 *
 * *
 * * *
 * * * *
 * * * * *
*/
public class Star_Ex1_Pro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println("* ");
        }
    }
}
