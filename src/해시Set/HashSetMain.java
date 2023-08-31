package 해시Set;

/*
중복을 허용하지 않음
순서도 보장하지 않음
수학의 집합과 유사한 개념임
*/

import java.util.Arrays;
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
//        String[] arr = {"H","e","l","l","o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");    // add 안됨
        for(String e : set) {
            System.out.print(e + " ");
        }
    }
}
