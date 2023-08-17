package 조건문_코테;
import java.util.Scanner;

public class Test_score_Pro {

    /*
    > 테스트 내용 <
    시험 성적을 입력 받아
    90 ~ 100점은 A,
    80 ~ 89점은 B,
    70 ~ 79점은 C,
    60 ~ 69점은 D,
    나머지는 F를 출력하는 프로그램

    0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
  -------------------------------------------------------
    - 입력을 위한 스캐너 생성
    - 입력을 받아서 정수형 변수에 대입
    - 조건문 만드는데 우선, 0~100 사이의 정상적인 입력인지 확인
    - 정상적인 입력이라면, 각각의 성적 구간에 따라 학점 출력
    */

    public static void main(String[] args) {
        // 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력 하세요 : ");
        // 입력을 받아서 정수형 변수에 대입
        int score = sc.nextInt();


        // 조건문 만드는데 우선, 0~100 사이의 정상적인 입력인지 확인
        if (score >= 0 && score <= 100) {
            // 정상적인 입력이라면, 각각의 성적 구간에 따라 학점 출력
            if(score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
        } else {
            System.out.println("성적을 잘 못 입력 하셨습니다.");
        }
    }
}
