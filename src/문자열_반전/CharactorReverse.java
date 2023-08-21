package 문자열_반전;
import java.util.Scanner;
/*
문자열을 입력 받음 : abcd → dcba

문자로 받아서 -> 크기 비교? -> 하나씩 잘라야? -> 반대로 나열
*/
public class CharactorReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.next();           // 문자열 받음

        int pos = input.length() -1;        // 문자열의 시작 위치를 찾음.(반전의 위치 = 맨 마지막 위치)
        while (pos > -1) {
            System.out.print(input.charAt(pos));        // 맨 마지막거 찍힘
            pos--;                                      // 하나씩 줄여가기
        }
    }
}
