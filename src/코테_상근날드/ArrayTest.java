package 코테_상근날드;

import java.util.Arrays;

/*
가장 저렴한 세트메뉴 구성 구하기
세트메뉴 = 햄버거 + 음료 - 50원

햄버거 - 800 / 700 / 900
음료 - 198 / 330
*/
public class ArrayTest {
    public static void main(String[] args) {
        int ham1 = 800;
        int ham2 = 700;
        int ham3 = 900;
        int coke = 198;
        int soda = 330;

        int[] arr = {ham1, ham2, ham3};
        Arrays.sort(arr);

        for (int i : arr) System.out.print("["+ i +"]");

        int ham_sel = arr[0];

        System.out.println("최저가 세트의 버거 : ");

    }

}
