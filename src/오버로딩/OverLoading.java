package 오버로딩;
/*
**메소드 오버로딩(method overloading)**

: 같은 이름의 메소드를 중복하여 정의하는 것.

: 원래 한 클래스내에 같은 이름의 메소드를 둘 이상 가질 수 없으나
  매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성 할 수 있음.
*/
public class OverLoading {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum("100",200));
        System.out.println(sum(100,200, 300));

    }
    static int sum(int x, int y) {
        return x + y;
    }
    static String sum(String x, int y) {    // 매개변수의 타입이 다르므로 오버로딩이 성립 함.
        return x + y;
    }
    static int sum(int x, int y, int z) {   // 매개변수의 개수가 다르므로 오버로딩이 성립 됨.
        return x + y + z;
    }
//    static double sum(int x, int y, int z) {   // 반환 타입이 오버로딩 조건에 포함되지 않음.
//        return x + y + z;
//    }
}
