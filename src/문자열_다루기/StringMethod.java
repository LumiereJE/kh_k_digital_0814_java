package 문자열_다루기;
/*
자바의 문자열을 나타내는 자료형은 String이며, 참조타입 자료형입니다.
equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함 ( T / F )

*/
public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");


        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));      // 문자열을 비교하는데 대소문자 구분 안함
    }
}
