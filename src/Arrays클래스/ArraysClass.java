package Arrays클래스;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
*/
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
        //Arrays.sort(arr);         // 오름차순 정렬
//        Arrays.sort(arr, Collections.reverseOrder());       //내림차순정렬. 기본타입을 허용하지 않음. int(x) integer(o)
//        for(int e: arr) System.out.print(e + " ");

        // 정렬 오버라이딩 : 재정의 / 정렬은 sort가 해줌. 정렬 조건이나 타이밍은 내가 지시하는 것임.
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2) return 1;       // 오름차순
//                if(o1 < o2) return 1;       // 내림차순
//            }
//        });

    }
}
