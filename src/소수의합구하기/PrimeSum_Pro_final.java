package 소수의합구하기;
import java.util.Scanner;
/*
입력 받은 정수 보다 미만의 소수의 합을 구하는 함수를 만드세요.
ex) 12이면 2+3+5+7+11 = 28
소수란 ? 1과 자기 자신 이외의 자연수로 나누어 지지 않는 수

스캐너로 숫자 입력 받기 -> 입력 받은 숫자 미만으로 범위 지정 -> 소수 구하기 -> 소수 합 구해서 출력 하기
*/
public class PrimeSum_Pro_final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        // 입력받은 정수 미만의 소수를 찾기 위해 반복적으로 prime() 메소드 호출.
        for(int i = 2; i < n; i++) sum += prime(i); // 2에서 부터 입력받은 정수 미만 중 소수.
        System.out.println(sum);
    }


    // 소수 구하기
    static int prime(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {    // 2부터 돌리는데, i는 2보다 작다는 조건이 깔려서 2는 소수가 됨.
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;       // 소수인 경우 매개변수로 전달 된 값을 반환.
        else return 0;
    }
}