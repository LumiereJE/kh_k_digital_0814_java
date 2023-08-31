package Set연습_학생성적정렬;

import java.util.TreeSet;

/*
미리 입력 받아놓고 시작.
5명의 학생에 대해 이름과 성적을 입력,
성적이 높은사람 순으로 정렬하고 성적이 같으면 이름순으로 정렬
*/
class Info {
    String name;
    int score;

    public Info(String name, int score) {
        this.name = name;
        this.score = score;
    }

}


public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Info> set = new TreeSet<>(new Ssort());
        set.add(new Info("혜린", 90));
        set.add(new Info("다니엘", 80));
        set.add(new Info("민지", 70));
        set.add(new Info("하니", 80));
        set.add(new Info("혜인", 100));
        for(Info e : set) {
            System.out.println("이름 : " + e.name + ", 점수 : " + e.score);
        }
    }
}
