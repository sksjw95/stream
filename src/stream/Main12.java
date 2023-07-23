package stream;

import java.util.Arrays;
import java.util.List;

public class Main12 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김코딩","이자바","박해커","김코딩","박해커");

        names.stream()
                .distinct() //중복제거
                .forEach(element-> System.out.println(element));
        System.out.println();

        names.stream()
                .filter(element-> element.startsWith("김")) // '김'이라는 글자로 시작한 문자열들 필터링
                .forEach(element-> System.out.println(element));
        System.out.println();

        names.stream()
                .distinct() // 중복제거
                .filter(element-> element.startsWith("김"))
                .forEach(element-> System.out.println(element));

        // 각각이 모두 독립적인 스트림이다.
    }
}
