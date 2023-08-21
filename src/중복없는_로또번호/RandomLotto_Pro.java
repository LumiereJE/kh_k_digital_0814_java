package 중복없는_로또번호;

public class RandomLotto_Pro {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int tmp, index = 0;             // 임시 로또 번호
        boolean isExist = false;        // 존재하지 않는다고 디폴트로 넣어버리기

        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            for(int i = 0; i < lotto.length; i++) {     // 배열 6개 까지 돌리기
                if(lotto[i] == tmp) isExist = true;     // 중복확인
            }
            if(!isExist) lotto[index++] = tmp;          // (존재하지 않으면) 넣고나서 증가시키기
            if(index == 6) break;
            isExist = false;
        }
        for(int e : lotto) System.out.print(e + " ");
    }
}
