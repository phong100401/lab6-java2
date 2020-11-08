//package L6j2;
//
//import java.sql.*;
//
//public class VD {
//    public static void main(String[] args) {
//        try(
//                Connection conn = DriverManager.getConnection(
//                        "jdbc:mysql://127.0.0.1:3306/ebookshop","root","");
//
//                Statement stmt = conn.createStatement();
//        ){
//
//            while (rset.next()){
//                System.out.println(rset.getInt("id") + ","
//                        + rset.getString("title") + ","
//                        + rset.getString("author") + ","
//                        + rset.getDouble("price") + ","
//                        + rset.getInt("qty"));
//            }
//        }catch (SQLException ex){
//            ex.printStackTrace();
//        }
//    }
//}
