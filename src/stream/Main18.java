// skip()- 스트림의  일부 요소들을 건너뜀
package stream;

import java.util.stream.IntStream;

public class Main18 {
    public static void main(String[] args) {
        // 1~10 범위의 정수로 구성된 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1,10);
        // 앞의 5개 숫자를 건너뛰고 숫자 6부터 출력
        intStream.skip(5).forEach(System.out::println);
    }
}
