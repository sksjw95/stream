//역순으로 정렬
package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main17 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Tiger","Lion","Monkey","Duck","Horse","Cow");
        //List<Integer> animals = Arrays.asList(1,4,9,62,21);
        //인자값에 Comparator 인터페이스에 규정된 메서드 사용
        // Comparator.reverseOrder() -> 역순 (내림차순)
        // stream 관련 정렬 기능을 사용하고 싶다면 sorted() 검색
        animals.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
