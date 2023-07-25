// reduce() 최종연산자는 스트림의 요소를 줄여나가면서 연산을 수행하고 최종적인 결과를 반환한다.
package stream;

import java.util.Arrays;

public class Main24 {
    public static void main(String[] args) throws Exception{
        int[] intArray = {1,2,3,4,5};

        // sum()
        long sum = Arrays.stream(intArray).sum();
        System.out.println("intArray 전체 요소 합 :" + sum);

        // 초기값이 없는 reduce()
        int sum1 = Arrays.stream(intArray)
                .map(element-> element * 2)
                .reduce((a,b)-> a+b)
                .getAsInt();
        System.out.println("초기값이 없는 reduce(): " + sum1);

        // 초기값이 있는 reduce()
        int sum2 = Arrays.stream(intArray)
                .map(element-> element * 2)
                .reduce(5,(a,b)-> a+b);
        System.out.println("초기값이 있는 reduce(): "+ sum2);

    }
}
