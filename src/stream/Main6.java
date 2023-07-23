// 배열로 스트림 생성
package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        // 문자열 선언 및 할당
        String[] arr = {"김코딩","이자바","박해커"};
        // 문자열 스트림 생성
        Stream<String> stream = Arrays.stream(arr);
        // 출력
        stream.forEach(System.out::println);
    }
}
