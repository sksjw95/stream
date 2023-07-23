// 2차원 배열 + 중간 연산
package stream;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) {
        // 2차원 배열
        String[][] namesArray = new String[][]{{"박해커","이자바"},{"김코딩","나박사"}};
        /*Arrays.stream(namesArray)
                .map(inner-> Arrays.stream(inner))
                .forEach(System.out::println); ->주소값이 출력된다.*/
        /*Arrays.stream(namesArray)
                .map(inner-> Arrays.stream(inner))
                .forEach(names-> names.forEach(System.out::println)); ->의도한 대로 출력된다.
                하지만 3차원 4차원까지 간다면 코드가 너무나 복잡해 질것이다.*/
        Arrays.stream(namesArray)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
