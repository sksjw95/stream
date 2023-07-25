/*average(),max(),min(),findFirst()는 분명히 최종 연산자이므로 스트림이 닫힌다고
배웠는데 왜 뒤에 getAsInt(),getAsDouble() 메서드 다시 붙고 있다. 왜 그럴까?
double average = Arrays.stream(intArray).average().getAsDouble(); 의 기존 코드를
예로 다음의 설명을 진행한다.     */
package stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main22 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        // 평균값을 구해 Optional 객체로 반환
        OptionalDouble average = Arrays.stream(intArr).average();
        System.out.println(average);

        // 기본형으로 전환
        double result = average.getAsDouble();
        System.out.println("전체 요소의 평균값 " + result);
    }
}
