package TV기본예제;

public class TV {
    private boolean isOn;       // tv 전원 on인지 off인지 구분하기
    private int channel;        // 채널
    private int volume;         // 볼륨

    // 초기화 값 설정
    TV() {          // 디폴트 값을 넣어준 것  -> 디폴트 생성자는 아님, 매개변수가 없는 생성자임.
        isOn = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isOn + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol) {     // 입맛대로 설정을 달리 넣어준 것.
        this.isOn = isON;                   // this.isOn은 현재 블록 안의 isOn을 가리킴.
        channel = ch;                       // 다른 애들은 이름을 바꿔줘서 구분이 되기 때문에 this를 굳이 안붙인것임.
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
            System.out.println("볼륨을 " + volume + "로 변경 하였습니다.");
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
