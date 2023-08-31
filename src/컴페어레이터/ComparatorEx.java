package 컴페어레이터;

/*
두개의 메서드를 비교하는 방법. (나 제외)
*/

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendComparator().reversed());    // 정렬에 대한 객체를 넣어줌
        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));
        for(Fruit e : set) {
            System.out.println("과일 이름 : " + e.name + ", 가격 : " + e.price);
        }
    }
}
