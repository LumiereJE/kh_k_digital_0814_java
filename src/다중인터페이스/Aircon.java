package 다중인터페이스;

public interface Aircon {
    int MAX_TEMP = 30;      // 상수라서 대문자로 써줘야 함. public final static
    int MIN_TEMP = 0;
    void airConON();
    void airConOFF();
    void setAirConTemp(int tmp);
}
