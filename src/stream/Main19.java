// limit() - 스트림의 일부를 자른다.
package stream;

import java.util.stream.IntStream;

public class Main19 {
    public static void main(String[] args) {
        // 1이상 10이하 정수로 구성된 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1,10);
        // 앞에서부터 5개의 숫자만 출력
        intStream.limit(5).forEach(System.out::println);
    }
}
