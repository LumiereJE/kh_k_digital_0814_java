package 대소문자변환;
import java.util.Scanner;
/*
 영어 소문자와 대문자로 이루어진 단어를 입력 받은 뒤,
 대문자 → 소문자
 소문자 → 대문자 로 바꾸어 출력하는 프로그램 작성
 charAt(index) : 문자열에 해당 인덱스 문자를 추출
 toCharArray() : 문자열을 문자 배열로 변환
*/
public class AlphaChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String alphabet = sc.next();

        // 문자열 길이 만큼 순회하면서 문자에 대한 ASCII 값 확인해서 대문자, 소문자 확인하고 계산해줌.
        for(int i = 0; i < alphabet.length(); i++) {
            char ch = alphabet.charAt(i);
            if(ch < 'a') System.out.print((char)( ch + ('a'-'A')));   // 소문자 a보다 앞에있으면 무조건 대문자임.
            else System.out.print((char) (ch - ('a'-'A')));
        }

    }
}
