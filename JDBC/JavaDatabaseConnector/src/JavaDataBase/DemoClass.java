package JavaDataBase;
import java.sql.*;

/*Java Database Connectivity
1.Import ---> java.sql
2.Load & Register Driver ---> com.mysql.jdbc.Driver
3.Establish Connector
4.Create Statement
5.Execute Query
6.Process Result
7.Close
 */

public class DemoClass {
   public static void main(String[] args) throws Exception{

      String url = "jdbc:mysql://localhost:3306/Alien";
      String user = "root";
      String pass = "root";

      Class.forName("com.mysql.jdbc.Driver"); //Register
      Connection con= DriverManager.getConnection(url,user,pass); //Conntection
      Statement st = con.createStatement(); //Statement
      /*
            <------ (Query for DQL) ------>
      String query= "Select * from Students";
      ResultSet rs = st.executeQuery(query); //put in Resultset

      // the pointer is basically before the 1st column so we shift it
      while(rs.next()){
         String userData= rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3);
         System.out.println(userData);
      }*/


      //<------ (Upadte for DML) ------>
      String query= "insert into Students values (5,'Chanda','Rani')";
      int cnt = st.executeUpdate(query);
      System.out.println(cnt+" records inserted");

      st.close();
      con.close();

   }
}
