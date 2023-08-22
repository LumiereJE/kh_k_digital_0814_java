package 소수의합구하기;
import java.util.Scanner;

public class PrimeSum_Pro_boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }


    // 소수 구하기
    static boolean prime(int n) {
        for(int i = 2; i < n; i++) {    // 2부터 돌리는데, i는 2보다 작다는 조건이 깔려서 2는 소수가 됨.
            if(n % i == 0) return false;
        }
        return true;
    }
}
