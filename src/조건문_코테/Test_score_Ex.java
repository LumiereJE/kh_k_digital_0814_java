package 조건문_코테;
import java.util.Scanner;
/*
시험 성적을 입력 받아
90 ~ 100점은 A,
80 ~ 89점은 B,
70 ~ 79점은 C,
60 ~ 69점은 D,
나머지는 F를 출력하는 프로그램

0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
*/

public class Test_score_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력 하세요 : ");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("A 등급 입니다.");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B 등급 입니다.");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C 등급 입니다.");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D 등급 입니다.");
        } else if (score >= 0 && score <= 59) {
            System.out.println("F 등급 입니다.");
        } else {
            System.out.println("성적이 잘 못 입력 되었습니다.");
        }
    }
}
