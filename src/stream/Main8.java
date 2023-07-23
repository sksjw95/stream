// IntStream의 유용한 기능들
package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main8 {
    public static void main(String[] args) {
        // int 형 배열로 스트림 생성
        int[]intArr = {1,2,3,4,5,6,7};
        IntStream intStream = Arrays.stream(intArr);

        // 숫자와 관련된 경우 intStream을 사용하는 것을 권장
        System.out.println("sum = " + intStream.sum());
    }
}
