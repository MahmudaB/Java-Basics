package MapDemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("ABCDE","BLHFGSWERTIIOJHH","CAT","DAQSWW");
        name.stream().map(n->n.toLowerCase()).forEach(System.out::println);

        name.stream().map(n->n.length()).forEach(System.out::println);
    }
}
