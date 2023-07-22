// 스트림을 사용한 반복 처리
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
        // forEach()는 Collection에서 사용하는 enhanced for문!
    }
}
