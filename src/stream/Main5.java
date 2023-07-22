package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 스트림은 데이터 소스가 무엇이냐에 관계없이 같은 방식으로 데이터를 가공/처리할 수 있다.
// 즉, 스트림을 사용하면 하나의 통합된 방식으로 데이터를 다룰수 있다는 뜻
public class Main5 {
    public static void main(String[] args) {


        // ArrayList
        List<String> fruitList = new ArrayList<>();
        fruitList.add("바나나");
        fruitList.add("사과 ");
        fruitList.add("오렌지 ");

        // 배열
        String[] fruitArray = {"바나나", "사과","오렌지"};

        //리스트->스트림
        Stream<String> ListStream = fruitList.stream();
        //배열->스트림
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        //출력
        ListStream.forEach(System.out::println);
        ArrayStream.forEach(System.out::println);
    }
}
