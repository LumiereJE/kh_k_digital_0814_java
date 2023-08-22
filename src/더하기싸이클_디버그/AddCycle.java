package 더하기싸이클_디버그;
import java.util.Scanner;
/*
입력받은 수를 더하기 싸이클 조건으로 수행했을 때, 몇 회 만에 원래 입력한 수와 같아지는지 확인하는 문제.
0 <= x =< 99
if(x < 10) → 앞에 0을 붙여서 각 자리의 숫자를 더한다.

26입력 → 2와 6으로 분리해서 더함 → 8
원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 → 68
-------------------- 1 cycle --------------------
69 → 6과 8을 분리해서 더함 → 14
원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 → 8 + 4 → 12
-------------------- 2 cycle --------------------
...
*/
public class AddCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();       // 최초 숫자를 입력 받음
        int totalCnt = 0;               // 총 싸이클 누적 횟수
        int calcNum = input;            // 최초 입력값이 변경 되지 않도록 하기 위함
        int divSum = 0;                 // 수를 10의자리와 1의자리로 분리해서 더하기 위한 변수
        int newNum = 0;                 // 더한 뒤, 새롭게 만들어진 수를 넣을 곳

        while(true) {
            totalCnt++;                 // 반복 될 때 마다 횟수 증가
            divSum = (calcNum / 10) + (calcNum % 10);  // 최초 숫자를 10자리 / 1의자리로 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10);  // 앞의 1의자리를 현재 10의자리로 올려주고, 초기 계산된 값의 1의 자리를 더함.

            if(newNum == input) break;          // 같으면 멈추고
            calcNum = newNum;

        }
        System.out.println(totalCnt);
    }
}
