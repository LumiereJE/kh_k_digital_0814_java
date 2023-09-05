package 조별_텍스트파일읽기;

// 파일 글 찍히는거 확인 -> 이름/수학/영어 점수 split써서 구분되어 값 들어가게 구현

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ProjectMain {
    public static void main(String[] args) throws IOException { // Input Output의 예외처리를 안하겠다.

        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/조별_텍스트파일읽기/Score.txt");  // 파일 읽기
        } catch(FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }

        Scanner sc = new Scanner(inputStream);

        while(sc.hasNextLine()) {                   // 다음 라인이 있어? 읽을 내용이 있으면 참.
            String[] lineSplit = sc.nextLine().split(" ");            // 문자열을 한줄씩 읽음 (줄바꿈 기준으로 읽음)
            treeSet.add(new Student(lineSplit[0],                           // split으로 자르고 treeSet으로 값을 분류해서 넣음
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println("이름 : " + e.name + ", 총점 : " + e.getTotal());
        }



    }

}
