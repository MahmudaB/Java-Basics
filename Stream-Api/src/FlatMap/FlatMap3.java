package FlatMap;

import java.util.*;

class Student{
    String name;
    int ID;
    Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
}
public class FlatMap3 {
    public static void main(String[] args) {

        List<Student> s1 = new ArrayList<Student>();
        List<Student> s2 = new ArrayList<Student>();

        s1.add(new Student("John", 101));
        s1.add(new Student("Mane", 102));

        s2.add(new Student("Neha", 103));
        s2.add(new Student("Mim", 104));

        List<List<Student>> ss = Arrays.asList(s1, s2);

        //WithOut Stream
        for(List<Student> l : ss){
            for(Student s : l){
                System.out.println(s.name);
            }
        }


        //With Stream
        ss.stream().flatMap(s -> s.stream().map(x->x.name)).forEach(System.out::println);
    }
}
