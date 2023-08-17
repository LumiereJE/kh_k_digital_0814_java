package 연산자_연습;
import java.util.Scanner;

public class OperateClass {
    public static void main(String[] args) {

        // 산술 연산자 : 사칙 연산(+, -, *, /)와 나머지 연산자 (%)
        int num1 = 10, num2 = 4;
        System.out.println("덧셈 : " + (num1 + num2));
        System.out.println("뺄셈 : " + (num1 - num2));
        System.out.println("곱셈 : " + (num1 * num2));
        System.out.println("나눗셈 : " + ((double)num1 / num2));       // 소수점 때문에 형 변환이 필요함
        System.out.println("나머지 : " + (num1 % num2));
        System.out.println("몫 : " + (num1 / num2));

        // 대입 연산자 : 값을 변수에 대입 하는 연산자 (=), 같다는 의미가 아니라 대입한다는 의미임.
        System.out.println(num1 += 2);      // 복합 대입 연산자. num1 = num1 + 2; 와 같음
        System.out.println(num1 -= 2);      // 10 → 12 → 10         변수라서 값이 계속 바뀜
        System.out.println(num1 *= 2);
        System.out.println(num1 /= 2);

        //증감 연산자 : 단항 연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자

        System.out.println(++num1);     // 전위 연산자, 선 대입 후 증가
        System.out.println(num1++);     // 후위 연산자,

        // 비교 연산자 : 두개의 피연산자를 비교해서 어느쪽이 큰지를 판단. boolean값으로 반환함.
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
        System.out.println(x > y);      // false
        System.out.println(x < y);      // true
        System.out.println(x == y);     // false
        System.out.println(x != y);     // true "같지 않지? 반대지?"
        System.out.println(x >= y);     // false
        System.out.println(x <= y);     // true

        // 논리 연산자 : &&(and : 둘 다 참인 경우),
        //             ||(or : 둘 중 하나라도 참이면 결과가 참)
        //              !(Not 연산자, 현재가 참이면 거짓, 거짓이면 참, 반대)
        rst1 = (x > 0) && (x > y);      // false
        rst2 = (x > 0) || (x < y);      // true
        rst3 = !((x > 0) || (x < y));   // false
        System.out.println(rst1 + " / " + rst2 + " / " + rst3);

        // 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산자
        Scanner sc = new Scanner(System.in);    // 키보드로 입력받기 위함
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);

        // 문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12);    // 문자열이 앞에오면 String으로 형 변환을 문자열로 시켜버림
        System.out.println(3 + 3.3 + "JDK");

        // 연산자 우선순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3;       // 30
        result2 = (val1 + val2) * val3;     // 50
        result3 = val1 + (++val2) * val3;   // 35

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
