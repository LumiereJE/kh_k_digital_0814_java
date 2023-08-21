package 문자열_다루기;
/*
indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
*/
public class IndexOf {
    public static void main(String[] args) {
        String a = "hello";


        System.out.println(a.indexOf("lt"));         // 문자가 시작되는 인덱스 반환
        // 0은 index에 디폴트로 있기 때문에 값이 없다고 나타낼땐 -1이라고 뜸.
    }
}
