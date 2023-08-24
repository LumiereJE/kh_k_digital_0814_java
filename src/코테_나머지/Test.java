package 코테_나머지;
import java.util.Scanner;

/*
- 10개의 수를 입력받은 뒤, 이를 42로 나눈 나머지를 구함
- 나머지를 구한 다음 서로 다른값이 몇개인지 구하는 문제
- 숫자 10개를 연속으로 입력 받음
*/

public class Test {
    public static void main(String[] args) {

        int[] arr = new int[42];        // 배열 42개 만들어두기 (나머지를 넣을 곳들)
        int n;                          // 입력 받은 값
        int cnt = 0;                    // 42로 나눈 나머지가 다른 숫자 일 경우에 대한 총 갯수
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개 입력 : ");

        for(int i = 0; i < 10; i++) {   // 10번 숫자 입력 받기 → 변수를 밖에서 만들고 들어가기. 안에 넣으면 변수를 계속 만들어냄.
            n = sc.nextInt();           // 반복문 안에서 입력 값 받기
            arr[n % 42] = 1;            // [입력받은 값 % 42]를 해서 나온 나머지에  인덱스 1을 대입해줌
        }
        for (int val : arr) {cnt += val;}       // 아래 for문을 향상된for로 구현한 것.
//        for(int i = 0; i < arr.length; i++) {
//            cnt += arr[i];
//        }
        System.out.println(cnt);
    }
}
