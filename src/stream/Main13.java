// 매핑 : map()-> 특정 형태로 변환을 하거나 원하는 필드를 추출한다.
package stream;

import java.util.Arrays;
import java.util.List;

public class Main13 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kimcoding","javalee","hackerna","luckguy");
        names.stream()
                .map(rds-> rds.toUpperCase())
                .forEach(rds-> System.out.println(rds));

    }
}
