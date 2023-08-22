package TV기본예제;

public class TVSample {
    public static void main(String[] args) {
        TV tv = new TV();
        //tv.getInfoTV();


        TV gTV = new TV(false, 20, 20);     // 이렇게 괄호안에 값을 직접적으로 넣으면, 값이 두번 뜨게 됨.
        //gTV.getInfoTV();
        gTV.setOn(true);
        gTV.setChannel(59);
        gTV.setVolume(20);
        gTV.getInfoTV();

    }
}
