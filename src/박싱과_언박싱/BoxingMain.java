package 박싱과_언박싱;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12;       // 오토(자동)박싱 한거임.

        Integer number = new Integer(12);       // 굳이 풀어서 쓰자면 이러함.
        System.out.println(number);

        Character ch = 'x';         // 오토 박싱
        char c = ch;                // 오토 언박싱
        System.out.println(c);      // x로 출력 됨.
    }
}
