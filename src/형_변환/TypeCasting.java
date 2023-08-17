package 형_변환;
/*

형 변환 
: 하나의 데이터 타입을 다른 타입으로 변환하는 것

명시적 형 변환
: 개발자가 의도를 가지고 형 변환을 하는 것

묵시적 형 변환 (오토 형 변환)
: 컴파일러가 자동으로 변환 해 주는 것
  유리한 방향으로 변경해 줌
  
*/
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double result1 = num1 / num2;                // 묵시적 형 변환이 이루어지지 않음 → 소수점 이하가 날아가버려서 0.0 출력 됨
        double result2 = (double) num1 / num2;       // 명시적 형 변환

        System.out.println(result2);



        String kor = "90";
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng;     // 총점구하기, 문자열로 받은 정보를 숫자형으로 바꾸기
        double avg = (double)total / 3;         // 평균은 double로 구하는데, 과목별 값을 정수로 받았으니 형 변환을 해줘야 함

        System.out.println(avg);

    }
}
