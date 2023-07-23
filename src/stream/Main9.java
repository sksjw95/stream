// 컬렉션 -> 스트림 생성
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {


        // 요소들을 리스트
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        //List<Integer> list = List.of(1,2,3,4,5,6,7); -> 당연히 똑같은 결과가 나온다.
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
    }
}
