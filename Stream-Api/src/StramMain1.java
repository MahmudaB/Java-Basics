import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface DemoAn{
    public void meth1();
    public void meth2();
}
interface Lambda{
    public void show(int a);
}
public class StramMain1 {
    public static void main(String[] args) {

        //Anonymous Class
        /*DemoAn demo = new DemoAn() {
            @Override
            public void meth1(){
                System.out.println("Meth1");
            }

            @Override
            public void meth2() {
                System.out.println("Meth2");
            }
        };

        demo.meth1();*/

        //Lambda Interface
        Lambda obj=(a)->{
            System.out.println("The value is "+a);
        };
        obj.show(12);


        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(30);
        list.add(1,100);
        System.out.println(list);

        List<Integer> Even= new ArrayList<Integer>();
        Even=list.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(Even);

        list.stream().filter(n->n%2==0).forEach(m->System.out.println(m));

        List<String> name=Arrays.asList("ABCDE","BLHFGSWERTIIOJHH","CAT","DAQSWW");
        name.stream().filter(n->n.length()>3 && n.length()<9).forEach(m->System.out.println(m));

    }
}
