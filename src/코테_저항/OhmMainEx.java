package 코테_저항;

import java.util.Scanner;
/*
저항값 구하기 : 컬러 문자열 2개를 입력 받음
첫번째 컬러 문자열은 10의 자리 수
두번째 컬러 문자열은 1의 자리 수
세번째 컬러 문자열은 곱하는 수
*/
public class OhmMainEx {
    public static void main(String[] args) {
        String[] color = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
        int frt = 0, sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        String frtColor = sc.nextLine();
        String secColor = sc.nextLine();
        String thdColor = sc.nextLine();

        for(int i = 0; i < color.length; i++) {
            if(frtColor.equals(color[i])) frt = i;      // 첫번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (10의자리)
            if(secColor.equals(color[i])) sec = i;    // 두번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (1의자리)
            if(thdColor.equals(color[i])) thd = i;    // 세번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (곱하는 수)
        }
        System.out.println( (long)((frt * 10) + sec) * (long)(Math.pow(10, thd)));       // 형변환.
    }
}
