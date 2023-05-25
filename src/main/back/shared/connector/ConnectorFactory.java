package main.back.shared.connector;

import java.sql.*;

public class ConnectorFactory {
    private static final String USER =   "root";
    private static final String PASS =   "teste123";

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String DATABASE =  "PERIODIC_TABLE";
    private static final int PORT = 3306;
    private static final String URL  =   "jdbc:mysql://localhost:" + PORT + "/" + DATABASE;

    private static final String ERROBD = "Erro na conexão com o Banco de Dados: "; 

    public static Connection getConn()
    {   try
        {   Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(ClassNotFoundException | SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }

    public static void closeConn(Connection conn)
    {   try
        {   if(conn != null) 
            {   conn.close();
            }
        } 
        catch(SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }

    public static void closeConn(Connection conn, PreparedStatement stmt) 
    {   closeConn(conn);
        try
        {   if(stmt != null) 
            {   stmt.close();
            }
        } 
        catch(SQLException e) 
        {   throw new RuntimeException(ERROBD + e);
        }
    }
}