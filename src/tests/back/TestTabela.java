package tests.back;

import java.sql.*;


public class TestTabela {
    public static void main(String[] args)  {
        String user = "root";
        String password = "teste123";
        String database = "world";
        int port = 3306;
        String url = "jdbc:mysql://localhost:" + port + "/" + database;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select Name from country");
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
