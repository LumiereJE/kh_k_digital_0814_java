package 디폴트_메서드;

public interface RemoteControl {
    int MAX_VOLUME = 100;           // 자동으로 final static이 추가 됨. → 상속이 안됨. 인터페이스 소속임.
    int MIN_VOLUME = 0;

    void turnON();                    // 리모콘을 켬. 자동으로 public abstract 추가 됨.
    void turnOFF();

    void setVolume(int vol);

    // 디폴트 메서드는 JDK8 이후에 추가 됨.
    default void setMute(boolean mute) {        // 오버라이딩이 필수가 아닌 선택사항이 됨.
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지 교환합니다.");
    }
}
