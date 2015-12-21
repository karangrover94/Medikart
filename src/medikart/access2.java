/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medikart;

/**
 *
 * @author Karan
 * 
 */
import java.sql.*;
public class access2
{
    String a,b;
    ResultSet rs;
    int i,j;
    
    access2(String s1,int k,int n,String s2)
  {
      a=s1;
      b=s2;
      i=k;
      j=n;
  }
    
     
       void  query()
        {
         try 
          {
           // System.out.println("hello ");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // System.out.println("heloo2");
            System.out.println("Driver Loading Succesful");
//            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\jhon\\Desktop\\Project\\Database1.mdb");
                 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\naman\\Desktop\\Database1.accdb");
            System.out.println("hello");
            //Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //access obj()
             
            System.out.println("hello");
            PreparedStatement ps=conn.prepareStatement("select medicine_name,medicine_id from medicine where medicine_name like concat('%',?,'%')and (Price between ? and ?)  and type=? ");
         //v=Integer.parseInt(st);
              System.out.println("hello2");
            ps.setString(1,a);
            ps.setInt(2,i);
            ps.setInt(3,j);
            ps.setString(4,b);
           // ps.setString(2, "*");
                    
            rs = ps.executeQuery();
         //  String s=rs.getString(1);
           // System.out.println(s);
           //ResultSetMetaData rsmd = rs.getMetaData();
            //System.out.println("Result set Created");
            
            //int id;
            //int salary;
            //System.out.println("id  ");
          //  String s;
            //int col=rsmd.getColumnCount();
           // System.out.println(col);
            //id=rsmd.getColumnCount();
            //int i=0;
          /* while(rs.next())
            {
               
                for ( i = 1; i <= col; i++) 
                {
                    
                 s=rs.getString(i);
                    System.out.println(s);

                }
                //salary=rs.getInt("salary");
               // System.out.println(s+"  " );
               // s=rs.getString("Medicine_Name");
                //System.out.println(s);
                //i++;
            }
            */
        }
        catch (Exception e) 
        {
        
            System.out.println(e.getMessage());        }
    
    }
    
    
}
