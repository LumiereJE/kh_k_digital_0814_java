package 회원정보;

public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();               // MemberInfo에 대한 참조변수를 만들어줌
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();
    }
}
