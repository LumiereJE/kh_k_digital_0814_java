package 중첩for문;
// 이중 반복문 :
public class DoubleFor_Ex1 {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {   // J for, 줄바꿈을 10번 반복
//           System.out.printf("|i=%d|", i);
//            for(int j = 0; j < 10; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();       // 줄바꿈
//        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; i < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
