package 코테_저항;
import java.util.Scanner;

/*
1. color / 곱 값 궇기 (배열이용)
2. 숫자 입력받기
3. 입력받은 숫자를 넣을 3개의 바구니를 샀어, fVal, sVal, tVal
4. 숫자를 입력받아
5. 바구니에 숫자를 넣어 (for문)
6. i가 10번에 도달할 때 까지 반복함
7. 입력받은 숫자값에 해당하는 내용 비교
8. 출력문에서 자료형 long 사용 해주기
*/

public class ColorCalc {
    public static void main(String[] args) {

        String[] color = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
        int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int fVal = 0, sVal = 0, tVal = 0;

        Scanner sc = new Scanner(System.in);
        String fColor = sc.nextLine();
        String sColor = sc.nextLine();
        String tColor = sc.nextLine();

        for(int i = 0; i < 10; i++) {
            if(fColor.equals(color[i])) fVal = i;
            if(sColor.equals(color[i])) sVal = i;
            if(tColor.equals(color[i])) tVal = num[i];
        }
        System.out.println((long)((fVal * 10) + sVal) * tVal);
    }
}
