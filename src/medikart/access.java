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



public class access
{
  String st;
  ResultSet rs;
  int v;
  access(String s)
  {
      st=s;
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
            //access obj()
            PreparedStatement ps=conn.prepareStatement("select medicine_name,medicine_id from medicine where medicine_name like concat('%',?,'%')");
         //v=Integer.parseInt(st);
            ps.setString(1,st);
           // ps.setString(2, "*");
            
                    
            rs = ps.executeQuery();
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

