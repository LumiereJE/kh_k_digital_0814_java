package TV기본예제;

public class TV {
    private boolean isOn;       // tv 전원 on인지 off인지 구분하기
    private int channel;        // 채널
    private int volume;         // 볼륨

    // 초기화 값 설정
    TV() {
        isOn = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isOn + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol) {
        this.isOn = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 : " + this.isOn + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onOffStr + "되었습니다.");
    }
    public void setChannel(int ch) {
        if(ch >= 1 && ch <= 999) {
            channel = ch;
            System.out.println("채널을 " + channel + "로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정값이 허용 범위를 벗어났습니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을" + volume + "로 변경 하였습니다.");
        }
    }
    public void getInfoTV() {
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }

}
