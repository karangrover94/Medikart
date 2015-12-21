/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medikart;

/**
 *
 * @author Karan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author naman
 */
//package project;
import java.sql.*;
import java.util.ArrayList;



public class access5
{
  String st;
  ResultSet rs,rs1;
  int v,v1;
  int max;
  ArrayList<String> arst1=new ArrayList<>();
  access5(ArrayList<String> arst3)
  {
      arst1=arst3;
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
            Statement stmt2=conn.createStatement();
            rs1=stmt2.executeQuery("select max(customer_id) as name from customer");
            //v=Integer.pasers.getString("max");
          //ResultSetMetaData rsmd=rs.getMetaData();
          //st=rsmd.getColumnName(1);
           // System.out.println(st);
while(rs1.next())
{ v1=rs1.getInt("name");
    //System.out.println(v);

          }
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("statement created");
            rs=st.executeQuery("select customer_id,customer_name,phone,address,email from customer");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("customer_id", v1+1);
            rs.updateString("customer_name", arst1.get(0));
            v=Integer.parseInt(arst1.get(1));
            rs.updateInt("phone", v);
           // v=Integer.parseInt(arst1.get(2));
            
            //rs.updateInt("q", v);
            rs.updateString("address", arst1.get(2));
            rs.updateString("email", arst1.get(3));
            //rs.updateString("manufacturer", arst1.get(5));
            //rs.updateString("type", arst1.get(6));
            rs.insertRow();
            System.out.println("row inserted");
//             rs=st.executeQuery("select medicine_id,drugs from composition");
//            System.out.println("result set created");
//            rs.moveToInsertRow();
//            System.out.println(rs);
//            rs.updateInt("medicine_id", v1+1);
//            rs.updateString("drugs", arst1.get(7));
//            rs.insertRow();
//            if(arst1.get(8)!="")
//            {
//              rs=st.executeQuery("select medicine_id,drugs from composition");
//            System.out.println("result set created");
//            rs.moveToInsertRow();
//            System.out.println(rs);
//            rs.updateInt("medicine_id", v1+1);
//            rs.updateString("drugs", arst1.get(8));
//              rs.insertRow();
            //}
            
            
              
//           
        }
        catch (Exception e) 
        {
        
            System.out.println(e.getMessage());        }
        return v1+1;        

    }
//  
}

