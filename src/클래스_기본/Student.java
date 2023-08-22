package 클래스_기본;

public class Student {
    // 인스턴스 필드(변수) 생성
    // private 외부에서 해당 필드에 대한 접근을 막음 → 같은 클래스 내에서만 직접적인 접근 가능
    // 외부에서 접근하려면 set/get 활용 해야 함
    private int id;             // 학번
    private String name;        // 이름
    private int grade;          // 학년
    private String addr;        // 주소

    // 메소드
    public void showInfo() {
        System.out.println(name + ", " + addr);
    }

    // setter 메소드
    public String setName(String name) {
        this.name = name;
        return "참입니다.";
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
