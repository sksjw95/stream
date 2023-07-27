package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

       int[] arr = {1,6,7,4};
       Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);


        System.out.println(Arrays.stream(arr2));


    }
}
