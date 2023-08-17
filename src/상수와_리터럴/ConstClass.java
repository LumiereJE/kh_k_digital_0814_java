package 상수와_리터럴;
/*
 상수 : 고정된 값. 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것.
       값을 변경하기 어려움. 값을 한번 쓰고 나면 read only 상태가 됨.
       final 키워드. 관례상 이름은 대문자로만 사용
       변수 앞에 final을 붙이게 되면 값을 변경할 수 없음.
*/

// 클래스 내에 변수 선언은 들어갈 수 있음. 코딩 문법은 못들어감 메인에 넣어야 함

import java.util.Scanner;       // 스캐너를 사용하기 위해 import를 해야함

public class ConstClass {

    final static String KH_DOMAIN = "http://192.167.12.13";
    final static String PORT_NUM = "8111";

    // static은 컴파일 될 때 단 한번만 만들어지는 것.


    public static void main(String[] args) {
        final int AGE;             // 자바는 선언과 별도로 어느위치든 상관 없이 한번만 값을 집어넣을 수 있고, 변경은 불가능.
        char gender = 'M';

        if(gender == 'M') {
            AGE = 33;
        }


//---------------------------------------------------------------------------------------------------------------

        final double TAX_RATE = 0.10;           // 세율 값을 고정함
        Scanner sc = new Scanner(System.in);    // 표준 입력을 받기 위해서 사용.
        System.out.print("수입을 입력 하세요 : ");
        int income = sc.nextInt();              // 키보드로 입력 받은 값을 정수형 변수에 저장
        System.out.println("당신이 내야할 세금은 " + (income * TAX_RATE) + "원 입니다.");

//---------------------------------------------------------------------------------------------------------------

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);


    }
}
