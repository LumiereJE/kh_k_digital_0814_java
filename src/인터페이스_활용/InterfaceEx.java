package 인터페이스_활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;       // customer 참조 변수를 buy 인터페이스형에 대입
        buyer.buy();                // sell 안나옴

        Sell seller = customer;     // customer 참조 변수를 sell 인터페이스형에 대입
        seller.sell();              // buy 안나옴
        Customer customer2 = (Customer) seller;  //다운캐스팅

        customer2.buy();            // sell, buy 둘 다 나옴.
        customer2.sell();
    }
}
