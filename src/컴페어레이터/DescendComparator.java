package 컴페어레이터;

import java.util.Comparator;

public class DescendComparator implements Comparator<Fruit> {
    @Override   // 리버쓰. 정렬을 반대로 만들어줌.
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public int compare(Fruit o1, Fruit o2) {    // 쟤네 둘이 비교할거라 매개변수가 두개 들어옴.
        // 비교조건만 넣어줌. 내림차순
        if(o1.price < o2.price) return 1;
        else if(o1.price == o2.price) return 0;
        else return -1;
    }



}
