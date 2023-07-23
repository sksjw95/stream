/*peek()와 forEach()는 요소들을 순회하며 특정 작업을 수행한다는 공통점이 있으나
        peek()는 중간 연산자라서 지정한 특정 작업을 여러번 수행할수 있지만,
        forEach()는 최종 연산자라서 마지막에 단 한 번만 사용가능하다.*/
package stream;

import java.util.stream.IntStream;

public class Main20 {
    public static void main(String[] args) {
        // 요소들을 사용하여 IntStream 생성
        IntStream intStream3 = IntStream.of(1,2,2,3,3,4,5,5,7,7,7,8);
        //짝수만 필터링하여 합계 구하기
        int sum = intStream3.filter(element-> element % 2 ==0)
                .peek(System.out::println)
                .sum();
        System.out.println("합계 = " + sum);
    }
}
