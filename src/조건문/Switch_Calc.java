package 조건문;
import java.util.Scanner;
public class Switch_Calc {
    public static void main(String[] args) {

        int x, y;       // 좌변, 우변
        char op;        // 연산자

        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");

        x = sc.nextInt();
        op = sc.next().charAt(0);       // 순서 중요 → 순서대로 값을 받아야 들어감
        y = sc.nextInt();               // 사용법 = 123 + 123 → 공백 중요


        switch (op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + ((double)x / y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력 하셨습니다.");

        }
    }
}
