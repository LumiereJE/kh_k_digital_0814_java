package 클론_오브젝트;
/*
클론은 cloneable 인터페이스를 상속받은 경우에만 가능함
*/
public class Member implements Cloneable {

    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("비밀번호 : " + password);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();      // 클론 메소드는 object클래스이므로 멥이 터입을 변경
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return cloned;
    }
}
