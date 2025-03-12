package StreamMethod;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
       List<Integer> list1 = Arrays.asList(50,1,23,-1,2,100);

       //sorted in ascending order
       List<Integer> Sorted=list1.stream().sorted().collect(Collectors.toList());

       //sorted in descending order
        List<Integer> SortedReverse=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(SortedReverse);
        System.out.println(Sorted);
    }
}
