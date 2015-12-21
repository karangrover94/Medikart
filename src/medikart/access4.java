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
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.*;
import java.util.ArrayList;



public class access4
{
  String st;
 // ResultSet rs;
 // int v,v1;
 // int max;
     int v=0;
  ArrayList<String> arst1=new ArrayList<>();
  access4(String s)
  {
      st=s;
  }
    //public static void main(String[] args) 
   // {
 int  query()
 {
try 
        {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loading Succesful");
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\naman\\Desktop\\Database1.accdb");
            System.out.println("connecttion with Database Succesful");
            //PreparedStatement ps=conn.prepareStatement("delete from medicine where medicine_name=? and type=?");
            PreparedStatement ps=conn.prepareStatement("select medicine_id as name from medicine where medicine_name=?");
            ps.setString(1, st);
         //   ps.setString(2, arst1.get(1));
            ResultSet rs=ps.executeQuery();
           
            while(rs.next())
            { v=rs.getInt("name");}
             ps=conn.prepareStatement("delete from medicine where medicine_name=?");
            ps.setString(1, st);
           // ps.setString(2, arst1.get(1));
            ps.executeUpdate();
             ps=conn.prepareStatement("delete from composition where medicine_id=?");
            ps.setInt(1, v);
            //ps.setString(2, arst1.get(1));
            ps.executeUpdate();
            
            
                   System.out.println(v);
            System.out.println("succedded");
            
//           
        }
        catch (Exception e) 
        {
        
            System.out.println(e.getMessage());       
        }
 return v;
    
    }

    
}

