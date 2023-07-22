// 선언형 프로그래밍 방식

package stream;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // List에 있는 숫자들 중에서 4보다 큰 짝수의 합계 구하기
        List<Integer> numbers = List.of(1,3,6,7,8,11);

        int sum = numbers.stream()
                .filter(number-> number > 4 && (number % 2 == 0))
                .mapToInt(number->number)
                .sum();

        System.out.println("선언형 프로그래밍을 사용한 합계 : " + sum);
    }
}
