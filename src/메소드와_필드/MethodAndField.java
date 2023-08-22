package 메소드와_필드;
/*
메소드 : 클래스 내에서 동작에 대한 기능을 부여한 것
        (함수가 클래스 내부에 있으면 메소드로 함)
필드 : 클래스 내에 존재하는 값을 저장하는 변수를 의미 함(상태를 저장)
*/
public class MethodAndField {
    public static void main(String[] args) {
    //    int result = sum(100,200, 300, 400);    // 매개변수의 갯수를 알 수 없는 경우에 사용
        int result = recFunction(10);       // 재귀변수 용
        System.out.println(result);
        // sum 은 callstack 부르면 나오는 스택
    }
    // 메서드 앞에 static 을 선언하는 경우 => 객체 소속이 아니고, 클래스 소속임.
    static int sum(int a, int b) {
        return a + b;
    }

    // 오버로딩 : 같은 변수 이름사용, 안에 추가 가능
    // sum 메서드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 전개연산자 '어러개가 존재한다'라는 의미.
    static int sum(int ... val) {
        int sum = 0;
        for(int e : val) sum += e;
        return sum;
    }

    // 재귀 호출 : 메소드 자신이 자신을 호출하는 것
    static int recFunction(int n) {
        if(n == 1) return 1;
        return n + recFunction(n - 1);
    }
    static int whileSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }
}
