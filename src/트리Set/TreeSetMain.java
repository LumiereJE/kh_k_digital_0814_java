package 트리Set;

/*
검색 기능을 강화시킨 자료구조
데이터가 저장될 때 이진검색트리 형태로 저장되고, 값을 검색할 때는 inOrder방식(Left-Root-Right)으로 탐색 함.
*/

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + " ");
    }
}
