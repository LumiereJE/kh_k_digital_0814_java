package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        // List 인터페이스의 참조변수로 ArrayList 객체를 참조 함
        List<MenuInfo> menuInfoList = new ArrayList<>();

        // .add는 객체를 추가 함 → 추가 할 때 마다 크기가 변함.
        MenuInfo menuInfo1 = new MenuInfo("Americano", 2500, "coffee", true);
        menuInfoList.add(menuInfo1);    // → 원래 이렇게 변수에 내용을 넣고 변수를 add에 넣어주는 것이나, 아래는 축약한것임.
        menuInfoList.add(new MenuInfo("Latte", 4500, "coffee", true));
        menuInfoList.add(new MenuInfo("BlackTea", 4000, "Tea", true));

        // 향상된 for문 : 배열 or 컬렉션 클래스의 자식들만 사용가능(List or Set)
        for(MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }
        for(int i = 0; i < menuInfoList.size(); i++) {
            System.out.print(menuInfoList.get(i).getMenuInfo());
        }
    }
}

class MenuInfo {
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }

    public String getMenuInfo() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }

}

