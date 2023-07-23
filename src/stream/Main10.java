package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Main10 {
    public static void main(String[] args) {
        // 난수 생성
        //IntStream ints = new Random().ints(5);
            IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println );
    }
}
