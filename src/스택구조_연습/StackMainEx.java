package 스택구조_연습;

/*
스택을 이용해서 열림괄호 닫힘괄호 체크하기
*/

import java.util.Stack;
import java.util.Scanner;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();

        // 입력 받은 문자열 길이 만큼 반복 순회함
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if(!st.empty()) st.pop();       // 닫힘 괄호일때 pop하기
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
    }
}
