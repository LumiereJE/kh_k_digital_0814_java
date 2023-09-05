package 스트림_문자스트림;

import java.io.*;

// Writer : 문자열 기반 출력 스트림의 최상위 추상 클래스
// Reader : 문자열 기반 입력 스트림의 최상위 추상 클래스

public class CharStreamEx {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "곰돌이사육사".toCharArray();       // 하나하나의 문자열로 바뀜
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush();     // 버퍼비우기
//        writer.close();

        Reader reader = new FileReader("test.txt");
        while (true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData);     // 아스키 코드값이 아닌 실제 문자로 보이게 함
        }
        reader.close();
    }
}
