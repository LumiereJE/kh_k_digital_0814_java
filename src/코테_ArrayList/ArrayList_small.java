package 코테_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Q : 정수 N개로 이루어진 배열 A와 정수 X가 주어진다.
    이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

첫째줄에 N과 X가 주어짐 (1 <= N, X <= 10000)
둘째줄에 수열 A를 이루는 정수 N개가 주어진다.

X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.  → split()
X보다 작은수는 적어도 하나 존재한다.

ex ) 10 5
     1 10 4 9 2 3 8 5 7 6

n, x 값 받기
n만큼 반복시키기 -> 리스트 입력받은 값을 추가시키는 것을 반복



*/

public class ArrayList_small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();   // 배열의 갯수
        int x = sc.nextInt();   // 크기를 비교하는 기준 값(미만값)

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());     // 리스트에 값을 추가 함
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
