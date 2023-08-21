package 참조타입_기초;

/*
자바의 데이터 타입은 기본 타입과 참조 타입으로 나뉜다.
기본타입은 정수, 실수, 문자, 논리값 등을 저장하는 타입 입니다. (실제값이 변수에 저장 됨)
참조타입은 객체의 주소를 변수에 저장 합니다. (배열, 열거형, 인터페이스, 클래스, 문자열)
*/

public class RefType {
    public static void main(String[] args) {
        // 기본타입
        int age = 25;   // int 형으로 만들어진 age라는 변수에 25라는 값을 저장함.
        double price = 100.5;   // double 형으로 만들어진 price변수에 100.5라는 실수 값을 저장 함.

        // 참조타입
        String name = "곰돌이사육사"; // String형으로 만들어진 name에는 실제 "곰돌이사육사"라는 문자열이 없고, 주소가 있음.

//        int nubox = 0;               // int형에 대한 기본타입이므로 값을 대입해야 함.
//        Integer boxedValue = null;      // int형에 대한 참조타입.
//        int intValue = boxedValue;
//        System.out.println(intValue);

        String strVal1 = "나희도";         // 리터럴 상수로 고정 됨
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); // heap 영역에 메모리 공간을 확보 함

        // 참조변수에서 ==, !=
        // 내용이 같냐는게 아니라, 주소가 같냐고 물어보는 것이 됨.
        // 내용이 같은지 확인하려면 .equals를 써야 함.

        if(strVal1 == strVal3) { // 주소가 같은지 물어 봄.
            System.out.println("strVal1과 strVal3는 참조하는 주소가 같음.");
        } else{
            System.out.println("strVal1과 strVal3는 참조하는 주소가 다름.");
        }

        if(strVal1.equals(strVal3)) {   // 포함된 내용, 즉 문자열이 같은지를 물어 봄.
            System.out.println("srtVal1과 strVal3의 내용이 같음");
        }

    }
}
