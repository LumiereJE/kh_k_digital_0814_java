package 스퀘어_출력;
import java.util.Scanner;
/*
input : 4
Output
1  2  3  4
5  6  7  8
9 10 11 12
*/
public class Square_Ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("4 입력하세용 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n*n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) {
                System.out.print("\n");
            }
        }

    }
}
