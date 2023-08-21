package 배열_복사;

import java.util.Arrays;

/*
 copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
*/
public class CopyOf {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int e : arr3) System.out.print(e + " ");

    }
}
