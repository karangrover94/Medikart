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

public class access6 {

    String st;
    ResultSet rs, rs1;
    int v, v1, v2;
    int max;
    int cid, mid, qn, am;
    ArrayList<String> arst1 = new ArrayList<>();

    access6(int cid, int mid, int qn, int am) {
        // arst1=arst3;
        this.cid = cid;
        this.mid = mid;
        this.qn = qn;
        this.am = am;
    }
    //public static void main(String[] args) 
    // {
    void query() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loading Succesful");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\naman\\Desktop\\Database1.accdb");
            System.out.println("connecttion with Database Succesful");
            Statement stmt2 = conn.createStatement();
            //rs1=stmt2.executeQuery("select max(customer_id) as name from customer");
            rs1 = stmt2.executeQuery("select max(order_id) as name from order");
            //v=Integer.pasers.getString("max");
            //ResultSetMetaData rsmd=rs.getMetaData();
            //st=rsmd.getColumnName(1);
            // System.out.println(st);
            while (rs1.next()) {
                v1 = rs1.getInt("name");
                //System.out.println(v);

            }
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("statement created");
            rs = st.executeQuery("select  order_id,medicine_id,quantity  from order");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("order_id", v1 + 1);
            //v=Integer.parseInt(arst1.get(0));

            rs.updateInt("medicine_id", mid);
            // v=Integer.parseInt(arst1.get(1));
            rs.updateInt("quantity", qn);
           // v=Integer.parseInt(arst1.get(2));

            //rs.updateInt("q", v);
//            rs.updateString("address", arst1.get(2));
//            rs.updateString("email", arst1.get(3));
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
            rs = st.executeQuery("select  order_id,customer_id from new");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("order_id", v1 + 1);
            //v=Integer.parseInt(arst1.get(0));

            rs.updateInt("customer_id", cid);
           // v=Integer.parseInt(arst1.get(1));
//            rs.updateInt("quantity",qn);
            // v=Integer.parseInt(arst1.get(2));

            //rs.updateInt("q", v);
//            rs.updateString("address", arst1.get(2));
//            rs.updateString("email", arst1.get(3));
            //rs.updateString("manufacturer", arst1.get(5));
            //rs.updateString("type", arst1.get(6));
            rs.insertRow();
            System.out.println("row inserted");

            rs1 = stmt2.executeQuery("select max(payment_id) as name from payment");
            while (rs1.next()) {
                v2 = rs1.getInt("name");
                //System.out.println(v);

            }
            Statement st1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("statement created");
            rs = st1.executeQuery("select  payment_id,amount,order_id from payment");
            System.out.println("result set created");
            rs.moveToInsertRow();
            System.out.println(rs);
            rs.updateInt("payment_id", v2 + 1);
            //v=Integer.parseInt(arst1.get(0));

            rs.updateInt("amount", am);
            // v=Integer.parseInt(arst1.get(1));
            rs.updateInt("order_id", v1 + 1);
           // v=Integer.parseInt(arst1.get(2));

            //rs.updateInt("q", v);
//                   }
            rs.insertRow();
            System.out.println("row inserted");
//           
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        //   return v1;        

    }
//  
}
