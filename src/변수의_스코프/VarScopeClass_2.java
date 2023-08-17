package 변수의_스코프;

public class VarScopeClass_2 {
    public static void main(String[] args) {

        // 문자 자료형 : 자바에서는 유니코드를 사용함 (2byte로 전세계의 모든 문자를 표시, 앞의 1Byte는 아스키와 동일 뒤의 128bit는 각국의 언어)
        char ch = 'A';          // 자바에서 문자는 작은 따옴표를 사용, 실제 저장은 정수값으로 저장 함 (""는 문자열에 사용함)
        String chA = "A";       //String은 문자열을 뜻해서 ""사용 가능

        System.out.println(ch);
        System.out.println((int)ch);    // 명시적으로 형을 int형으로 변경 함

        char ch2 = 66;      // char형은 음수가 올 수 없음
        System.out.println(ch2);
        System.out.println((int)ch2);


        // 실수 자료형 : float(4Byte, 32bit), double(8Byte) → (소수점)근사치 계산법이 적용됨.
        float height = 175.5f;      // 뒤에 f를 안붙이면 오류
        double pi = 3.14152344299;  // 정확도를 위해서 주로 double형을 사용 함

        double num1 = 0.1;          // 절대 딱 떨어지는 수가 나오지 않음.
        for(int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);

    }
}
