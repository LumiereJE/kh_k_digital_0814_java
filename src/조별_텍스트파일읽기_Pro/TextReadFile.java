package 조별_텍스트파일읽기_Pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.Scanner;

public class TextReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/조별_텍스트파일읽기_Pro/score.txt");
        Scanner sc = new Scanner(fis);

        while(sc.hasNext()) {
            // 안유진 99 78 45
            String[] lineSplit = sc.nextLine().split(" ");      // 공백기준으로 잘라서 배열에 넣음
            treeSet.add(new Student(lineSplit[0],
                   Integer.parseInt(lineSplit[1]) +
                        Integer.parseInt(lineSplit[2]) +
                        Integer.parseInt(lineSplit[3]) ));
        }
        for(Student e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
