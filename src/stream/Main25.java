package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main25 {
    public static void main(String[] args) {
        //Student 객체로 구성된 배열 리스트 생성
        List<Student> totalList = Arrays.asList(
                new Student("김코딩",100,Student.Gender.Male),
                new Student("박해커",80,Student.Gender.Male),
                new Student("이자바",90,Student.Gender.Female),
                new Student("나미녀", 60, Student.Gender.Female));

        //스트림 연산 결과를 Map으로 반환
        Map<String,Integer> maleMap = totalList.stream()
                .filter(s->s.getGender()== Student.Gender.Male)
                .collect(Collectors.toMap(student -> student.getName(),//key
                        student -> student.getScore()// value
                         ));
        System.out.println(maleMap);

    }
}
