package Set연습_학생성적정렬;

import java.util.Comparator;

public class Ssort implements Comparator<Info> {


    @Override
    public int compare(Info o1, Info o2) {
        if (o1.score > o2.score) return 1;       // 성적순 오름차순
        else {
            if (o1.score == o2.score) {
                return o1.name.compareTo(o2.name);      // 사전 순 정렬
            }
            return -1;
        }

    }
}