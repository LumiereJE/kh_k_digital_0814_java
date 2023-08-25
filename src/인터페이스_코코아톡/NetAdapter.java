package 인터페이스_코코아톡;

// 인터페이스들을 추상화
// 필요해1! 만 해두고 구현 안한 상태
public interface NetAdapter {
    void connect();
    void send(String msg);
}

// 인터페이스를 상속받은 클래스1
class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
// 인터페이스를 상속받은 클래스2
class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}


