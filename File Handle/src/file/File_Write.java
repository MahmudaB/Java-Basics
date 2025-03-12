package file;

import java.io.File;
import java.util.*;
public class File_Write {
    public static void main(String[] args) {
        try{
            Formatter fo=new Formatter("E:/Java Basics/File Handle/Person/student.txt");
            fo.format("%s %d","Mahmuda",102);
            fo.close();
        }catch(Exception e){
            System.out.println("File Write Error");
        }

    }
}
