package 문자열_다루기;
/*
subString : 문자열 중 특정한 문자열을 뽑아 낼 때 사용함
            시작 인덱스만 주는 경우와 시작과 끝을 주는 경우가 있음
*/
public class SubString {
    public static void main(String[] args) {

        String e = "Hello Java";

        System.out.println(e.substring(4, 7));      // 4에서 7미만 = 4,5,6번 index 추출
    }
}
