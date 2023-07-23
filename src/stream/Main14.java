// 매핑 : map()-> 특정 형태로 변환을 하거나 원하는 필드를 추출한다.
package stream;

import java.util.Arrays;
import java.util.List;

public class Main14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,6,9);
        // 각 요소에 3을 곱한 값을 반환
        list.stream()
                .map(number-> number * 3)
                .forEach(//number-> System.out.println(number)//두 가지 반환값은 같다.
                        System.out::println);
    }
}
