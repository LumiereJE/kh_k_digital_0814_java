package 샘플프로그램;     // 패키지명 : 클래스의 묶음

public class SampleClass {
    /*
     main 앞에는 public 이거나 없음. →  접근 제한자 중 하나로, 모두 허용함
     static은 정적 함수
     void는 '비어 있다' → 넘겨줄게 없음
     String[] → 매개변수임. '이 함수에 집어 넣는다'
              프로그램 시작할 때 집어 넣으면, 여기에 넣어짐.

     메소드에 대한 접근제한자 : public, protected, private, default

     main코드 : 시작지점을 말함, 하나만 있어야 함 ( 컴파일 - 통번역을 따로 거쳐야 하는 언어일 경우 해당 )
               따로 진입지점이 없는 코드 ( 동시통역같은 개념, 한줄씩 번역함)

     파이썬과 자바스크립트는 자료형이 없음 → 자료형이 있는 현대버전인 타입스크립트가 나옴

     C++ : like 선악과, 기능을 다 줄테니 쓸거면 써라, 안좋은 기능도 있을수 있음
     java : 안좋은 기능을 다 뺐음, 그래서 좀 기능이 제한적인데 불편함은 딱히 없음



    */
    public static void main(String[] args) {
        System.out.println("샘플프로그램을 만들어 봅니다.");
    }
}
