package 스트림예제_2번;

// 반복자 스트림 forEach() : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종연산에 해당합니다.
// 최종연산을 돌린다 -> 더이상 스트림을 사용할 수 없음(스트림은 1회용임)

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("고유림", 67),
                new Student("나희도", 55),
                new Student("우영우", 99),
                new Student("최수연", 96),
                new Student("권민우", 92)
        );

        double average = list.stream()  // 스트림 생성  map = 입력받은 갯수와 반환 갯수가 같은것이 특징
                .mapToInt(Student::getScore)     // 메소드 참조, 중간 연산
                .average() // 중간연산
                .orElse(0.0);   // 만약 스트림이 비어있으면 0.0으로 반환
        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100);   // 1~100까지로 구성된 정수 스트림 생성
        System.out.println("합계 : " + stream.sum());

        // for.Each 버전
//        list.forEach(s->{
//           String name = s.getName();
//           int score = s.getScore();
//           System.out.println(name + " : " + score);
//        });

//         향상된 for문 버전
//        for(Student s : list) {
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        }

//         내부 반복자를 이용한 병렬처리 .parallelStream()
//        list.parallelStream().forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}