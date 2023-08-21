package 중복없는_로또번호;

import java.util.ArrayList;
import java.util.List;

public class RandomLotto_Pro2 {
    public static void main(String[] args) {

        // ArrayList 사용해서 풀기
        List<Integer> list = new ArrayList<>();
        int tmp;
        while(true) {
            tmp = (int) ((Math.random() * 45) + 1);
            if(!list.contains(tmp)) {       // .contains → 포함하는지 물어봄
                list.add(tmp);
            }
            if(list.size() == 6) break;
        }
        System.out.println(list);

    }
}
