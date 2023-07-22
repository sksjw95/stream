// Iterator를 사용한 반복 처리
package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 배열 -> 리스트
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        // Iterator생성
        Iterator<Integer> it = list.iterator();

        // 리스트를 순회하며 값 출력
        while (it.hasNext()){
            int num = it.next();
            System.out.print(num);
        }

    }
}