package 스트림_파일복사하기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/차은우.jpg";       // 기존위치
        String targetFileName = "d:/temp/오잉.jpg";               // 옮길 위치와 파일 이름.

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {      // 맨 앞에서부터 읽어야 함
            fos.write(readBytes, 0, readByteNo);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
