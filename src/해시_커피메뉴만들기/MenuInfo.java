package 해시_커피메뉴만들기;

import java.io.Serializable;

public class MenuInfo implements Serializable {
    private String name;      // 메뉴 명
    private int price;          // 메뉴 가격
    private String category;    // 분류
    private String description;  // 메뉴에 대한 설명

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public MenuInfo(String coffee, int price, String category, String description) {
        this.name = coffee;
        this.price = price;
        this.category = category;
        this.description = description;
    }

}


