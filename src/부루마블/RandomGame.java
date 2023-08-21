package 부루마블;

/*
두개의 주사위를 던져 12가 나오면 탈출하는 게임 ....... 부루마블의 무인도였음..
*/
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;                               // 주사위 2개
        int cnt = 0;                                    // 몇 트라이 했는지 세어주는 변수

        while(true) {                                   // 몇 번만에 성공 할지 몰라서 while 사용
            cnt++;                                      // 트라이 늘어남
            rand1 = (int) ((Math.random() * 6) + 1);    // 정수 값이 필요. 랜덤 돌리면 0.1 ~ 5.99 의 실수값 발생
                                                        // → 5.99가 되므로 +1 해줘서 6.99가 나오게 하고 정수만 출력

            rand2 = (int) ((Math.random() * 6) + 1);
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d트 끝에 탈출 했습니다. \n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}
