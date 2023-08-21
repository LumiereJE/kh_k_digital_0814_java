package While문;
import java.util.Scanner;

// 반복 횟수를 알 수 없는 경우의 while 예제
// do ~ while : 한번은 무조건 수행하고 조건을 물어보는 반복문
public class While_Ex2 {
    public static void main(String[] args) {
        int age;                // 나이를 입력 받는 변수

        // do ~ while문
        do {
            System.out.print("나이를 입력해주세요 : ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
        } while(age <= 0 || age >= 200);

        System.out.println("입력하신 나이는 " + age + "세 입니다.");

        // while문
//        Scanner sc = new Scanner(System.in);
//        while(true) {           // 무한하게 반복하기 위해 아예 (true)를 박아버림. 반드시 탈출문이 필요함!!!
//            System.out.print("나이를 입력하세요 : ");
//            age = sc.nextInt();
//
//            if(age > 0 && age < 200) break;     // 1 ~ 199 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력 하셨습니다.");
//        }


    }
}
