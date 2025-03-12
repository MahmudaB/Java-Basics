package exception_handling;

import java.util.*;
public class ExceptionDemo1 {
    public static void main(String[] args) {
         try {
            //int x = 10, y = 0;
            //int res = x / y;
            //System.out.println(res);

            int[] a=new int[7];
            a[7]=0;
             System.out.println(a[7]);
        }catch(ArithmeticException e) {
            System.out.println("Exception "+e);
        }catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Exception "+e);
         }
         finally {
             System.out.println("Last Line");
         }
    }
}
