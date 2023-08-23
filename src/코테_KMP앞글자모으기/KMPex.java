package 코테_KMP앞글자모으기;
import java.util.Scanner;
/*
Knuth - Morris - Pratt → KMP
Mirko - Slavko → MS

- split("-")을 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
- 0번째 선택, "-" 다음의 첫번째 문자를 선택하는 방법
- 대문자만 골라냄 ( chatAt(index), toCharArray( ))

*/
public class KMPex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("대문자로 시작하는 문자열 입력 : ");
        String name = sc.next();

        // 1번 방법 - name 자른게 A ~ Z 사이라면 → 참
//        for(int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }

//        // 2번 방법 - 0번째 문자 선택 출력, '-'다음에 위치한 문자 찍기
//        for(int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i));
//            }
//        }

//        // 3번째 방법 split()메소드 이용
//        String[] splitName = name.split("-");       // 새로운 배열 3개 만들어짐
//        for(String e: splitName) System.out.println(e.charAt(0));

        // toCharArray() : 문자열을 문자 배열로 변경
        char[] chName = name.toCharArray();         // 문자열을 문자 배열로 변환
        for(char ch : chName) {
            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
