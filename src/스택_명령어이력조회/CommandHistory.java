package 스택_명령어이력조회;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// history 10개까지만 기억하게 하고, 11개 부터는 맨 앞의 타이핑부터 삭제하는 코드

public class CommandHistory {

    // queue라는 참조변수를 만들어서 linkedList를 생성함
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도음말을 볼 수 있습니다.");

        while(true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim();      // 입력 받은 문자열 앞, 뒤에 공백 제거

            if(cmd.equalsIgnoreCase("q")) { // 대소문자 구분 없앰
                System.exit(0);     // 프로그램을 강제 종료
            } else if (cmd.equalsIgnoreCase("help")) {  // 도움말 보여줘
                System.out.println("help - 도움말을 보여줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if(cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for(String e : history.queue) {               // history의 queue만큼 순회
                        cnt++;
                        System.out.println(cnt + ", " + e);
                }
            } else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }

    void save(String cmd) {
        queue.offer(cmd);
        if (queue.size() > MAX_SIZE) queue.remove();    // queue의 사이즈가 정한 MAX_SIZE보다 크면, 맨 앞의 요소를 제거.(remove)
    }
}



