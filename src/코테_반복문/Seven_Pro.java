package 코테_반복문;

public class Seven_Pro {
    public static void main(String[] args) {
//-----방법 1---------------------------------------------------
        for(int i = 1; i <= 1000; i++) {
            if(i % 7 == 0) {
                System.out.printf("%5d", i);
                if(i % 70 == 0) System.out.println();
            }
        }
//-----방법 2---------------------------------------------------
//        int cnt = 0;
//        for(int i = 7; i <= 1000; i+=7) {
//            System.out.printf("%5d", i);
//            if(cnt == 10) {
//                System.out.println();
//                cnt = 0;
//            }
//        }


    }
}
