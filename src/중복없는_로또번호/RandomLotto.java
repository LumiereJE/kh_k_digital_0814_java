package 중복없는_로또번호;
/*
 1 ~ 45 사이의 임의의 수 6개를 생성 해야 함. (입력은 받지 않음, Math.random() → 0.1 ~ 0.999 )
 int val = (int)((Math.random() * 45) + 1);

 단 중복은 제거 if → 중복 되는지 찾아야 함 → 중복 제거 후 다시 돌리기
 생성된 val 값을 배열에 담을 때, 배열 내에 해당 하는 값이 있는 지 확인 필요.

 배열은 6개, 반복횟수는 확실하지 않음(while(true)) + 탈출 조건이 있어야 함 (중복되지 않은 번호 6개가 저장되면 break)

*/
public class RandomLotto {
    public static void main(String[] args) {
        int val = (int)((Math.random() * 45) + 1);




    }
}
