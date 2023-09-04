package 매개변수_람다식;

@FunctionalInterface    // 함수형 프로그램을 만들기 위한 어노테이션 (안붙여도 되지만 함수형 프로그램이라는것을 명시적으로 알려주기 위해 사용)
interface MyFuncInterface {     // 내용물을 인터페이스로 만드는데에 의미가 있음. 내부에 함수가 두개 이상 들어가면 에러남.
    void method(int x);
}

@FunctionalInterface  // 리턴값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}

public class LamdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> {     // 매개변수가 한개인 경우는 () 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y;     // 구현부가 한 줄인 경우 {} 생략가능, return생략
        System.out.println(fi2.min(3,4));
    }
}
