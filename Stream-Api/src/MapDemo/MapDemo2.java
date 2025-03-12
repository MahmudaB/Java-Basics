package MapDemo;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> Mul=new ArrayList<>();
        //WithOut Stream
        for (Integer i : list) {
            Mul.add(i*3);
        }
        System.out.println(Mul);

        //with Stream
        list.stream().map(x -> x * 3).forEach(System.out::println);
    }
}
