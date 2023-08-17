package 변수와_자료형;
/*
    변수란?
       값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것

*/
public class DataTypeClass {
    public static void main(String[] args) {
        int age;        // 정수형 변수 선언    4byte(32bit) 공간을 확보 하고 초기값은 아직 없는 상태.
                        //                  정수값(소수점 이하가 없는 값)을 저장하는 목적. 양수 음수 둘 다 가능.

        int st1;        // O. 숫자가 뒤에 있기 때문에 가능.
        int ___123;     // O. 허용됨.
        int $$$___;     // O. 허용됨.
        int taxRate;    // O. camel 표기법 : 자바는 카멜 표기법을 사용함.

        double value;   // 실수값을 저장하기 위한 변수 선언

        // 문자형 변수 선언
        char gender = 'M';      // 선언과 동시에 초기화 함. gender 변수에 문자 'M'을 대입한다는 의미.

        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해서 사용하는 자료형, 1byte
        boolean isTrue;     // 나머지 언어는 0을 제외한 모든 값을 '참'으로 판별함. 자바만 T/F로 나누고 명시함.
        boolean isTrue2 = true;     // True, False 예약어만 사용 가능.

        // 정수형 변수 선언 : 소수점 이하가 없고, 양수와 음수가 존재함.
        byte bNum;          // 1byte 크기의 변수 선언. 1Byte = 8bit  (-128 ~ 127  0을 양수로 취급하기 때문)  (사실 잘 안씀..)
        short sNum;         // 2byte 크기의 변수 선언. 16bit           (사실 잘 안씀..)
        int iNum;           // 4byte 크기의 변수 선언. 32bit
        long lNum;          // 8byte 크기의 변수 선언. 64bit

        // 실수형 변수 : 1이라는 딱 떨어지는 값을 사용하지 못함. 근사치 계산을 함. 기준값으로 사용 불가함. CPU 학대임...
        //              근데 ai에는 쓰임. 학습과정의 자료수집처럼 모호한 값의 집합체가 되면 강해진다.. .!!
        float fNum;         // 4byte
        double dNum;        // 8byte    자바는 주로 double을 씀

        int num1, num2;           // 같은 타입의 변수를 동시에 선언 가능. ','로 구분함.
        double num3 = 3.14;       // 선언과 동시에 값을 초기화 함
        double num4 = 1.23, num5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute + "분");

        // 문자형 → 문자열 String
        // String : 참조형으로, 실제 데이터보다는 데이터가 보관된 주소가 있는것임. 주소값은 8byte.
        //          기본 타입이 아니라 주소값을 가지는 참조타입이라서 대문자로 시작함.
        //          자바의 JVM에 저장되고 주소값을 따로 주는데, 사용자가 알 필요가 없어서 주소를 안알려줌 ㅇㅇ
        //          근데 C++경우는 알려주는데, 이게 사용자가 맘대로 바꾸면 오류를 불러올 수 있음
        //          기본타입 : 해당하는 자료값 만큼 자리를 확보함 → 몇 byte인지 정해짐 → 용량 넘어가면 overflow
        //          참조타입 : 주소로 갖다 쓰는 거라서 자료량이 많아도 괜찮음


        byte num6 = 127;        // byte 범위 : -128 ~ 127     128부터 오류
        num6++;

        System.out.println(num6);       // -128이 나옴. overflow 됨.

    }
}
