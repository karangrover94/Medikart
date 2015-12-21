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
import java.util.ArrayList;



public class access3
{
  String st;
  ResultSet rs,rs1;
  int v,v1;
  int max;
  ArrayList<String> arst1=new ArrayList<>();
  access3(ArrayList<String> arst3)
  {
      arst1=arst3;
  }
    //public static void main(String[] args) 
   // {
 void  query()
 {
try 
        {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loading Succesful");
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\naman\\Desktop\\Database1.accdb");
            System.out.println("connecttion with Database Succesful");
            Statement stmt2=conn.createStatement();
            rs1=stmt2.executeQuery("select max(medicine_id) as name from medicine");
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
            rs=st.executeQuery("select medicine_id,medicine_name,price,quantity,usage,side_effect,manufacturer,type from medicine");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("medicine_id", v1+1);
            rs.updateString("medicine_name", arst1.get(0));
            v=Integer.parseInt(arst1.get(1));
            rs.updateInt("price", v);
            v=Integer.parseInt(arst1.get(2));
            
            rs.updateInt("quantity", v);
            rs.updateString("usage", arst1.get(3));
            rs.updateString("side_effect", arst1.get(4));
            rs.updateString("manufacturer", arst1.get(5));
            rs.updateString("type", arst1.get(6));
            rs.insertRow();
            System.out.println("row inserted");
             rs=st.executeQuery("select medicine_id,drugs from composition");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("medicine_id", v1+1);
            rs.updateString("drugs", arst1.get(7));
            rs.insertRow();
            if(arst1.get(8)!="")
            {
              rs=st.executeQuery("select medicine_id,drugs from composition");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("medicine_id", v1+1);
            rs.updateString("drugs", arst1.get(8));
              rs.insertRow();
            }
            
            
            
//            
//           
        }
        catch (Exception e) 
        {
        
            System.out.println(e.getMessage());        }
    
    }
    
}

