package 예외처리_3번째;

/*
 NullPointException (NPE) : JAVA에서 발생하는 대표적인 런타임 에러.
                            참조하려는 객체가 없는 경우에 발생 함.
*/

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        // 오류
//        String testStr = test.name;
//        System.out.println(testStr);

        // 오류 처리
        if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("test가 null 입니다.");
        }

    }
}

class Test {
    String name = "곰돌이사육사";
}
