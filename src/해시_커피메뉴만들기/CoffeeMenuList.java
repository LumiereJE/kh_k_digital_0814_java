package 해시_커피메뉴만들기;

import 스트림_직렬화연습.Board;

import java.io.*;
import java.util.List;
import java.util.Scanner;

/*
HashMap으로 커피 메뉴 리스트 만들기
*/

import java.util.HashMap;
import java.util.Map;

import static 스트림_직렬화연습.SerializeEx.readList;
import static 스트림_직렬화연습.SerializeEx.writeList;

public class CoffeeMenuList {
    // HashMap을 만들어서 커피메뉴 리스트 만들기

    // 문자열로 만들어진 키와 커피의 여러가지 정보가 포함 된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        makeMenu();
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피"));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한 커피"));
        map.put("Latte", new MenuInfo("Latte", 4500, "Coffee", "우유 포함"));
        map.put("IceTea", new MenuInfo("IceTea", 3500, "Coffee", "아이스티"));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = "";            // key 값을 받기 위해
        while(true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescription());
                        System.out.println("-".repeat(25));
                    }
                    break;
                case 2 :
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    // 포함여부를 확인하는 메소드 containskey(key) :map내에 해당 키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescription());
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;

                case 3 :
                    System.out.print("추가 할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print ("가격 입력: ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력: ");
                        String category = sc.nextLine();
                        System.out.println("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                        break;
                    }
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    } break;

                case 5 :
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print ("가격 입력: ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력: ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // key값은 동일하고 값이 변경되는 경우에 replace()를 사용
                        map.replace(key, new MenuInfo(key, price, category, description));
                    } else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");

                    FileOutputStream fos = new FileOutputStream("src/해시_커피메뉴만들기/coffee.bin");
                    // 직렬화
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);       // 최상단에 있는것 넣어주기 -> map
                    // 마감
                    oos.flush();
                    oos.close();
                    fos.close();

                    return;     // return을 써서 main돌아가면 중지 됨.
                default: System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}




