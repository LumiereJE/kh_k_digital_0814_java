package 변수의_스코프;

// 변수가 할당되고 사용되는 범위 확인

public class VarScopeClass {
    public static void main(String[] args) {
        int value = 10;             // int 형으로 선언된 변수에 10을 대입
        int sum = value + 20;       // int 형으로 선언된 sum 변수에 value의 값 + 20
        System.out.println("sum의 값 : " + sum);

        int n = 20;
        if (n > 10) {
            int m = 30;
            m = n - 10;
            System.out.println("m값 : " + m);
        }
        // int k = n + m;       // 자바는 블록 스코프이기 때문에 중괄호 밖에서 선언하면 오류가 남
    }
}
