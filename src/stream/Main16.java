// 기본 정렬
package stream;

import java.util.Arrays;
import java.util.List;

public class Main16 {
    public static void main(String[] args) {
        // 동물들의 이름을 모아둔 리스트
        List<String> animals = Arrays.asList("Tiger","Lion","Monkey","Duck","Horse","Cow");
        //List<Integer> animals = Arrays.asList(1,74,41,4,7,2);
        // 인자값 없는 sort() 호출 -> sorted()만 사용하였다면 오름차순으로 정렬된다.
        animals.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
