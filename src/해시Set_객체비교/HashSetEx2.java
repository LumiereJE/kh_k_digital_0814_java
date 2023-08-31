package 해시Set_객체비교;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        Member member4 = new Member(1003, "카리나");   // 중복이 아님. 인스턴스 주소값이 다름. → HashCode가 다름.
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
    //    hashSet.add(new Member(1003, "카리나"));       // new로 추가해버리면 주소값이 달라서 걍 +1로 됨. 중복체크 못함.
    //    for(Member e : hashSet) e.showMember();                 // 중복 체크 하려면 오버라이딩 해서 id값으로 잡아야 됨.

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        // s1.addAll(s2);   //합집합 : 양 쪽 모두에 있는 것. 중복제거
        s1.retainAll(s2);   //교집합 : 양 쪽 모두 존재하는 항목
        s1.removeAll(s2);   //차집합 : 앞에서 뒤를 빼는것

        System.out.println(s1);
    }
}

class Member {
    int id;     // 회원 아이디,식별.
    String name;

    @Override
    public int hashCode() {     // 객체의 인스턴스 주소로 hashCode를 구하지만 지금 인스턴스 주소로 구별 안되니까, id값으로 구하도록 한 것임
        return id;              // 중복되게 일부러 id값으로 변환해준것임. 중복 잡으라고!!!!!!
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {     // 다운캐스팅이 성립되는지 확인하기 위한 조건.
            Member member = (Member) obj;   // 원래 타입으로 타입변환
            if(this.id == member.id) return true;   // id가 같으면 중복이라고 판별 해줌.
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
