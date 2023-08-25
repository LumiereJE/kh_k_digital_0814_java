package 추상클래스두번째;

// Phone은 인스턴스화 될 수 없음
public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {         // 매개변수가 있는 생성자를 만들어 줌.
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call();
}
