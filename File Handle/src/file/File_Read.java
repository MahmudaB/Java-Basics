package file;

import java.io.File;
import java.util.*;

public class File_Read {
    public static void main(String[] args) {
        try{
            File file=new File("E:/Java Basics/File Handle/Person/student.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String name=sc.next();
                Integer id=sc.nextInt();
                System.out.println(name+" "+id);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
