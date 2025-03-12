package file;

import java.io.File;
import java.util.*;
public class FileDemo1 {
    public static void main(String[] args) {
      File dir=new File("Person");
      dir.mkdir();
      String path=dir.getAbsolutePath();
      File file1 = new File(path+"/student.txt");
      try {
          file1.createNewFile();
          System.out.println("File is created");
      } catch (Exception e) {
          System.out.println(e);
      }
    }
}
