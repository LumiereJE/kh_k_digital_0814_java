package 조별_텍스트파일읽기;

import java.io.FileInputStream;
import java.util.Scanner;

public class Student implements Comparable <Student> {

    String name;

    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    int getTotal() {
        return kor + eng + mat;     // getTotal로 합계 구함
    }

    @Override
    public int compareTo(Student o) {
        // 정렬조건
        if(this.getTotal() < o.getTotal()) return 1;        // 뒤에 값이 더 크면 뒤집어 줄 return 1;
        else return -1; // return 0 하면 함수값이 중복 값을 삭제하므로 -1로 처리.

        // + treeset은 중복은 삭제하니까 같은 점수일 경우도 데이터 안지워지게 처리 해줘야함

    }
}
