/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medikart;

/**
 *
 * @author naman
 */
//package project;
import java.sql.*;



public class access7
{
  String st;
  ResultSet rs,rs1;
  int v;
  access7(int cid)
  {
      v=cid;
      //v=v+1;
  }
    //public static void main(String[] args) 
   // {
 void  query()
 {
try 
        {
           // System.out.println("hello ");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // System.out.println("heloo2");
            System.out.println("Driver Loading Succesful");
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\naman\\Desktop\\Database1.accdb");
            System.out.println("connecttion with Database Succesful");
            Statement stmt= conn.createStatement();
           rs = stmt.executeQuery("Select customer_name from customer where customer_id ="+v);
            //access obj()
//            PreparedStatement ps=conn.prepareStatement("select customer_name,phone,address,email from customer where customer_id = ?");
//         v=Integer.parseInt(st);
//            ps.setInt(1,v);
//            
//            PreparedStatement ps1=conn.prepareStatement("select m.medicine_name,o.quantity from medicine m,order o,new n where n.customer_id=? and n.order_id=o.order_id and o.medicine_id=m.medicine_id");
//            ps1.setInt(1, v);
//           // ps.setString(2, "*");
//            
//                    
//            rs1=ps1.executeQuery();
//            rs = ps.executeQuery();
//           //ResultSetMetaData rsmd = rs.getMetaData();
//            //System.out.println("Result set Created");
//            
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

