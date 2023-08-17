package 비트연산자;
/*
 비트 연산자는 비트 단위의 연산을 수행합니다.
 AND : & : 비교하는 두개의 비트가 모두 1이어야 1.
  OR : | : 비교하는 두개의 비트가 한쪽만 1이면 1이 됨.
 XOR : ^ : 비교하는 두 비트가 서로 다른 경우에만 1, 같으면 0.
 NOT : ~ : 현재의 비트값을 반전 시킴.
           2의 보수가 적용되기 때문에, 음수로 전환될 때 1이 차이가 남.
           ex) 10 → -11

   왼쪽 쉬프트 : << : 비트를 왼쪽으로 이동 시킴. 1칸당 x2한 효과가 있음.
 오른쪽 쉬프트 : >> : 비트를 오른쪽으로 이동 시킴. 1칸당 /2한 효과가 있음.

*/

public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
    }
}
