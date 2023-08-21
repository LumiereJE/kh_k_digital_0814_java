package 반복문_별찍기_연습;
import java.util.Scanner;
/*
 삼각형 별 찍기
 입력 받은 수 만큼 별 찍기
 ex) 5 입력
 *
 * *
 * * *
 * * * *
 * * * * *

 - 수 입력받기
 - 조건 : 입력받은 만큼
 - 수행 : 별 찍기
 - 1부터 한개씩 늘어날때 마다 별 찍는것을 반복  i++
*/
public class Star_Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
