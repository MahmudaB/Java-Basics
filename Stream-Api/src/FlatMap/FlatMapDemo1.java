package FlatMap;

import java.util.*;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2);
        List<Integer> list3= Arrays.asList(2,3);
        List<Integer> list2= Arrays.asList(4,5);

        List<List<Integer>> FinalList= Arrays.asList(list1,list2,list3);

        FinalList.stream().flatMap(l->l.stream().map(n->n+10)).forEach(System.out::println);
    }
}
