package 디폴트메소드_중복;

public interface Buy {
    void buy();         // public abstract 자동으로 추가 됨.
    default void order() {      // 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

// 디폴트 클래스는 오버라이딩을 해도 되고, 안해도 되는데 두 인터페이스안에 갖고 있으니까 모호성이 높아져서 문제로 잡음
// -> order가 누구껀지 모호함... -> 명시적으로 지정해줘야함 (customer 오버라이드 해서 누구거라고 Buy.super.order() 라고 명시해줘야 함)

class Customer implements Buy, Sell {

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Buy.super.order();
        Sell.super.order();
    }

    @Override
    public void sell() {

    }
}
