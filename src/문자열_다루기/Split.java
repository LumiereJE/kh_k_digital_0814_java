package 문자열_다루기;
/*
Split : 문자열을 특정 구분자로 분리하는 함수
*/
public class Split {
    public static void main(String[] args) {

        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String e : modifyTime) System.out.print(e + " ");

    }
}
