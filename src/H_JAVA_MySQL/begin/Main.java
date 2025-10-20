package H_JAVA_MySQL.begin;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectDB.openConnect();
        try {
            System.out.println("ket noi thanh cong");
        }catch (Exception e) {
            e.printStackTrace();

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten nguoi dung");
        String ten = sc.nextLine();
        System.out.println("nhap mat khau");
        String mat = sc.nextLine();

        try {
            String sql = "{call inset_db(?,?)}";
            CallableStatement cstm = conn.prepareCall(sql);
            cstm.setString(1, ten);
            cstm.setString(2, mat);
            cstm.executeUpdate();
            System.out.println("add sucess");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            conn.close();
        }
    }
}
