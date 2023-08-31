package 해시_커피메뉴만들기;

public class MenuInfo {
    String name;      // 메뉴 명
    int price;          // 메뉴 가격
    String category;    // 분류
    String description;  // 메뉴에 대한 설명

    public MenuInfo(String coffee, int price, String category, String description) {
        this.name = coffee;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
