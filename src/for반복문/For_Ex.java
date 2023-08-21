package for반복문;

/*
    for(초기식; 조건식; 증감식) {
         조건이 '참'인 동안에 수행 되는 구문}
     : 주로 정해진 횟수를 반복하는 경우에 사용됨.
*/

public class For_Ex {
    public static void main(String[] args) {

//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i);            // 오른쪽 기준으로 4칸 확보
//            if(i % 10 == 0) System.out.println();
//        }
//------------------------------------------------------------------
        int i = 1;

        for(;;) {
            System.out.printf("%4d", i);            // 오른쪽 기준으로 4칸 확보
            if(i % 10 == 0) System.out.println();
            i++;
            if(i > 100) break;
        }
//------------------------------------------------------------------
//        int i = 1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//            if(i > 100) break;
        }
    }

