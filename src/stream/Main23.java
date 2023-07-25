// 매칭과 관련된 최종연산자

package stream;

import java.util.Arrays;

public class Main23 {
    public static void main(String[] args) {
        int[] intArray = {2,4,6};

        //allMatch()
        boolean result = Arrays.stream(intArray).allMatch(element-> element % 2 == 0);
        System.out.println("요소 모두 2의 배수인가요? " + result);

        //anyMatch()
        result = Arrays.stream(intArray).anyMatch(element-> element % 3 == 0);
        System.out.println("요소 중 하나라도 3의 배수가 있나요? " + result);

        //noneMatch()
        result = Arrays.stream(intArray).noneMatch(element-> element % 3 == 0);
        System.out.println("요소 중 3의 배수가 하나도 없나요? " + result);
    }
}
