package 상속TV;

// 설계도 만드는 페이지.

// PrototypeTV로부터 상속받아서 ProductTV class를 만듦
public class ProductTV extends PrototypeTV{
    String name;
    boolean isInternet;

    ProductTV() {           // 생성자 만들어 디폴트 값 넣어주기
        name = "Smart TV";
    }

    ProductTV(String name) {
        isPower = false;     // 생성자 만들어 디폴트 값 넣어주기
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }

    //--------- 오버라이딩 : 부모에게서 물려받은 기능을 재정의해서 사용하는 것 ------------
    // 오버라이딩은 동적바인딩 = 런타임중에 결정남(항상 자식이 우선인건 아니고, 런타임중에 결정이 남)


    @Override // 어노테이션 → 상속이 문법적으로 맞냐 체크하는거라 빼도 되지만, 빼면 오버라이딩인지 구분 힘드니까 걍 두자
    public void setChannel(int ch) {
        if (ch > 1 && ch < 2000) {
            channel = ch;
            System.out.println("채널을 " + channel + "변경 했습니다.");
        } else System.out.println("채널 설정 범위를 벗어났습니다.");
    }

    // 메서드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 갯수로 구분하는 것.
    public void setChannel(int ch, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = isInternet;
        } else {                                // 인터넷 모드가 아닌 것
            this.isInternet = false;
            if(ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을 " + channel + "변경 했습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }

    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}
