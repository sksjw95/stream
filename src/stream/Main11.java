package stream;

import java.util.stream.IntStream;

public class Main11 {
    public static void main(String[] args) {
        // 특정 범위의 정수
        IntStream intStream = IntStream.rangeClosed(1,10);// 1이상 10이하
        //                             .range(1,10) ->1이상 10미만
        intStream.forEach(System.out::println);
    }
}
