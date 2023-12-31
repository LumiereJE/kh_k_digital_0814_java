package 인터페이스_기본;

public interface NetworkAdapter {
    public abstract void connect();         // 자동으로 public abstract가 포함 됨.
}

// 유선 인터넷
class LAN implements NetworkAdapter {
    String company;
    LAN(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결 되었습니다.");
    }
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결 되었습니다.");
    }
}

