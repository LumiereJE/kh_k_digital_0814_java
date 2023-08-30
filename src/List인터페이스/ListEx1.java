package List인터페이스;

/*
리스트 인터페이스는 ArrayList, Linked List, Vector의 부모이며 인터페이스로 구현되어 있음
리스트 구조는 배열과 유사하고 차이점은 동적으로 크기가 변한다는 점임.
 ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
ArrayList : 리스트 타입의 대표적인 자료구조 (특별한 경우가 아니라면 대부분 ArrayList사용)
            검색이 빈번한 경우에 효율적, 맨 뒤에 입력이 일어난 경우는 효과적임
            insert delete가 위치의 제약이 없음. 중간에 실행되어도 ok -------? 이거 Linked ..?

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"100", "200", "300", "10", "50", "250"};

        // 이미 만들어진 배열을 ArrayList에 추가 : Arrays.asList(배열이름)
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        // List에 값을 추가 : (add())
        list.add("400");
        list.add("500");
        list.add("600");
        System.out.println(list);

        // 특정 위치에 값을 가져올 때 : .get(index)
        System.out.println(list.get(2));

        // List의 크기를 가져올 때 : .size()
        System.out.println(list.size());

        // List내에 해당하는 항목이 있는지 판별 : .contains()
        System.out.println("포함 여부 확인 : " + list.contains("1423"));

        // List에서 객체에 해당하는 항목을 삭제, 그 값을 반환 : .remove(객체)
        // 해당하는 인덱스의 값을 삭제하고 삭제된 값을 반환 : .remove(index)
        System.out.println("삭제 성공 여부 확인 : " + list.remove( "100"));

        // 정렬하기
        list.sort(Comparator.naturalOrder());   // 오름차순
        list.sort(Comparator.reverseOrder());   // 내림차순


        System.out.println(list);
    }
}
