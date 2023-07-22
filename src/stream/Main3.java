// 명령형 프로그래밍 방식
// 코드 한 줄 한 줄의 동작 원리를 이해하고 순차적이고 세세하게 이를 규정하는 방식
// "어떻게" 코드를 작성할지에 집중
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        //List에 있는 숫자 중에서 4보다 큰 짝수의 합계 구하기
        List<Integer> numbers = List.of(1,3,6,7,8,11);
        int sum = 0;

        for(int number : numbers){
            if(number > 4 && (number % 2 == 0)){
                sum = sum + number;
            }
        }
        System.out.println("명령형 프로그래밍을 사용한 합계 : " + sum);
    }
}