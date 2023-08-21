package 문자열_다루기;
/*
replaceAll : 문자열 중에서 특정 문자열을 다른 문자열로 변경 (정규 표현식)
*/

public class replaceAll {
    public static void main(String[] args) {
        String a = "hello java";

        String e = "Hello Java";
        System.out.println(e.replaceAll("Java", "Python"));
        System.out.println(e.replace("Java", "Python..."));

        System.out.println(e.replaceAll("Java", " ")); // 대체할 문자를 공백으로 두면 삭제가 됨.

        // replaceAll로 하면 regex이 생김. → 정규 표현식으로 넣을 수 있다
        // replace
    }
}
