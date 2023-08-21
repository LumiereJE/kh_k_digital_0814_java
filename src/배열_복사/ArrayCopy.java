package 배열_복사;
/*
자바의 배열은 한 번 선언하면 크기를 변경 할 수 없음 → 정적 할당
배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 함.
arraycopy() : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
                               복사할 변수명, 복사할 위치, 붙여넣을 변수명, 붙여넣을 위치, 붙여넣을 길이
*/
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int newLen = 10;
        int[] arr2 = new int[newLen];
        System.arraycopy(arr1,0,arr2, 4, arr1.length);
        for(int e : arr2) System.out.print(e + " ");

    }
}
