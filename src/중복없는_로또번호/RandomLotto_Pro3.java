package 중복없는_로또번호;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomLotto_Pro3 {
    public static void main(String[] args) {

        // Set 사용해서 풀기 : 자바에서 사용하는 집합 개념.
        // 집합에 중복값 허용 안하는 특징을 이용함. → 중복 제거를 따로 안해줘도 됨.
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
