package 시스템_입력;
import java.util.Scanner;

// Scanner 클래스를 사용해서 입력 받음
public class SystemInput {
    public static void main(String[] args) {
        /*
        클래스 : 설계도면이라고 생각하면 됨
        sc : 스캐너 클래스에 대한 객체변수
        new : 동적인 할당
        */

        Scanner sc = new Scanner(System.in);

        /*
        byte a = sc.nextByte();             // byte형 입력을 받아서 반환
        short b = sc.nextShort();           // short형 입력을 받아서 반환
        int c = sc.nextInt();               // int형의 입력을 받아서 반환
        long d = sc.nextLong();             // long형의 입력을 받아서 반환
        char ch = sc.next().charAt(0);      // 문자열에서 원하는 위치(0)의 index를 추출해서 반환
        float e = sc.nextFloat();           // float형의 입력을 받아서 반환
        double f = sc.nextDouble();         // double형의 입력을 받아서 반환
        String h = sc.next();               // 공백 기준으로 입력받음
        String i = sc.nextLine();           // 줄바꿈 문자 기준으로 입력받음
        */

        //------------------------------------------------------------------------------------

        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();            // 이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어 감
        sc.nextLine();          // 버퍼 비우기 용도 (의미없는 라인 하나 넣기)
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();        // 줄바꿈이 일어나면 다음 입력으로 넘어 감
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0);  // 입력받은 문자열에서 맨 앞의 문자 한 자를 추출함
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
