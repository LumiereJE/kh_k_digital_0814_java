package Vector클래스;

/*
ArrayList 구조와 메소드가 동일함.
Vector는 동기화가 지원되어서 멀티스레드 환경에 안전함.
하지만 ArrayList대비 성능이 떨어짐.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new ArrayList<>();
        list.add(new NameCard("우영우", "yyyy@gamil.com", "010-1234-1234", "변호사"));
        list.add(new NameCard("동그라미", "yyyy@gamil.com", "010-1234-1234", "무직"));
        list.add(new NameCard("이준호", "yyyy@gamil.com", "010-1234-1234", "회사원"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
