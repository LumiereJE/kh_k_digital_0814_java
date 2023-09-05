package 해시_커피메뉴Read;
import 해시_커피메뉴만들기.MenuInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 파일 가져오기(읽어오기)
        FileInputStream fis = new FileInputStream("src/해시_커피메뉴만들기/coffee.bin");

        // 객체에서 읽을 수 있게 해주기
        ObjectInputStream ois = new ObjectInputStream(fis);

        Map<String, MenuInfo> map = (Map<String, MenuInfo>) ois.readObject();

        for(String key : map.keySet()) {
            System.out.println("메뉴 : " + map.get(key).getName());
            System.out.println("가격 : " + map.get(key).getPrice());
            System.out.println("분류 : " + map.get(key).getCategory());
            System.out.println("설명 : " + map.get(key).getDescription());
            System.out.println("-----------------------------------------");

        }

    }
}
