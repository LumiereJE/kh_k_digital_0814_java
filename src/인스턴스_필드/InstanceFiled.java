package 인스턴스_필드;

public class InstanceFiled {
    public static void main(String[] args) {
        int val = 30;       // 지역 변수
        FieldTest fieldTest1 = new FieldTest();
        fieldTest1.instanceVal = 200;
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300;

        FieldTest.classval = 1000;

    }
}
