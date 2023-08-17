package 시스템_출력;

/*
System.out : 표준 출력 스트림
print, println : 오버로딩이 적용되는 메서드이며, 줄바꿈 차이만 있음.
      오버로딩 : 객체지향 다형성의 부분. 타입별로 나뉘어 있긴 하지만 println이라고만 쳐도 알아서 해당 메서드를 찾아서 적용시켜줌
printf : 오버로딩이 적용되지 않음. 직접 포멧 서식을 입력 해줘야 함.
*/

import java.util.Scanner;

public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;

        // 자바스타일 : 오버로딩으로 구현되어 있음


        System.out.printf("%s\n", name);              //  \n = 줄바꿈 을 넣어서 println 효과를 낼 수 있음


        System.out.println("======= Java Style ========");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + kor + eng + mat);
        // println 은 오버로딩이 걸려있어서 string이 앞에 적히면 자동으로 String타입으로 인식함 → 형변환을 해버림. . .

        System.out.println("총점 : " + (kor + eng + mat));    // → 괄호를 이용해서 분리시켜 줌 (우선순위 부여)
        System.out.println("평균 : " + ((double)kor + eng + mat)/3);
        System.out.println("평균 : " + (kor + eng + mat)/3.0);
        // 연산자 우선 순위가 덧셈보다 나눗셈이 높아서 순서를 변경해야 함 → ()를 사용해서 순서 변경


        /*
        C언어 스타일
        : 서식을 지정하는 스타일
        서식 지정자 : %d(정수), %ld(long 타입 정수), %u(부호가 없는 정수형), %f(실수 형), %c(문자 형)
        이스케이프 시퀀스 : \n(줄바꿈), \r(캐리지 리턴-커서를 라인의 처음으로 위치시킴), \t(탭-4칸 띄워줌),
        \b(백스페이스-앞글자를 지움) 정말로 백 스페이스가 필요하면 \\ 두개 넣어주면 됨.
        */
        System.out.printf("이름 : %s\n", name);
        System.out.printf("오늘의 습도는 %.2f%% 입니다.\n", 85.50);
        System.out.printf("오늘의 습도는 %.2f%% 입니다.\n", 85.55555);         // 실수형 출력, 소수점 2자리까지 표시 및 자동 반올림
        System.out.printf("성별 : %s\n", gender);                           // 문자 출력

        System.out.println("안녕하세요. 저는 \"곰돌이 사육사\" 입니다.");        // 정말 쌍따옴표가 넣고 싶은 경우 이스케이프를 붙여주면 됨.
        System.out.printf("평균 : %.2f\n", (kor + eng + mat) / 3.0);

        System.out.println("Apple\rBanana\tOrange\b\b\n");
        System.out.printf("|%-6d| |%-6d| |%-6d|\n", 100, 2000, 30000);      // %-6d → 6칸 잡기

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i=1; i <= n*n; i++) {
            System.out.printf("%4d", i);        // "%4d → 4칸 잡기
            if(i % n == 0) System.out.println();
        }

    }
}
