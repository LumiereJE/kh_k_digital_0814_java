package 상속TV;

public class PrototypeTV {
    boolean isPower;    // 전원값 저장
    int channel;        // 채널 정보 저장
    int volume;         // 볼륨 값 저장

    // 생성자 디폴트 값 생성
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }

    // 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int ch) {
        if(ch > 0 && ch <1000) {
            channel = ch;               // 인스턴스 필드에 값이 반영 됨
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
