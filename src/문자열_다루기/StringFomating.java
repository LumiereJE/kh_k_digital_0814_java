package 문자열_다루기;

public class StringFomating {
    public static void main(String[] args) {
        System.out.println();
        
        // 문자열 포매팅 출력을 위해서 사용
        System.out.printf("I eat %d apples.\n", 3);


        String test = String.format("I eat %d apples.", 3);

        System.out.println(test);
        // System.out.println(String.format("I eat %d apples.", 3));
    }
}
