package 조건문;
import java.util.Scanner;
/*
조건문은 조건을 만족하는 경우와 만족하지 않는 경우로 나누어 수행하는 것

 조건문 추천 순위
        1. 삼항연산자 쓸 수 있으면 삼항연산자를 쓰자
        2. switchCase
        3. else if는 가독성이 떨어짐

*/
public class ConditionEx1 {
    public static void main(String[] args) {

        // if ~ else : '참'인 경우와 거짓인 경우를 나누어서 수행
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 100) {
            System.out.println(num + "은 100보다 커요");
        } else if (num < 100) {
            System.out.println(num + "는 100보다 작아요");
        } else {        // 예측 못한 경우를 대비 해서 else를 꼭,,
            System.out.println(num + "는 100살과 같아요.");
        }


        System.out.print(" 문자를 입력 하세요 : ");
        Scanner sc1 = new Scanner(System.in);
        char ch = sc1.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 알파벳 소문자 입니다.");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 알파벳 대문자 입니다.");
        } else {
            System.out.println(ch +  "는 알파벳이 아닙니다.");
        }


    }
}
