package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

/*
Map의 하나의 형태
키와 값이 모두 String 타입으로 제한 된 형태.
*/
public class PropertiesMain {
    public static void main(String[] args) throws IOException {     // 자바 입출력 예외처리 한번에 함 → 에러방지
        Properties properties = new Properties();

        // 같은 폴더에 있던 데이터 파일을 다른 폴더로 옮겨도 데이터가 살아있게 만들기
        // 옮겨진 폴더의 경로를 입력해주면 됨.
        String path = PropertiesMain.class.getResource("../클론_오브젝트/database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");    // 한글 처리를 위함 (문자열 디코딩)
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }


}
