package main.back.shared.repo;

import main.back.domain.repo.RepositoryInterface;
import main.back.shared.connector.ConnectorFactory;
import main.entities.Element;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepositoryMySQL implements RepositoryInterface{
    private String table_name = "ELEMENTS";

    @Override
    public ArrayList<Element> getAllElements() {
        Connection conn = ConnectorFactory.getConn();

        ArrayList<Element> dados = new ArrayList<>();
        String sqlSelect = "SELECT * FROM " + table_name + ";";
        PreparedStatement stmt = null;
        ResultSet result_set;
        
        try{   
            stmt = conn.prepareStatement(sqlSelect);
            result_set = stmt.executeQuery();
            while(result_set.next()){  
                Element prof = new Element(
                    result_set.getInt("atomicNumber"),
                    result_set.getString("name"),
                    result_set.getString("symbol"),
                    result_set.getInt("neutronNumber"),
                    result_set.getInt("atomicMass"),
                    result_set.getString("groupCode"),
                    result_set.getInt("year"),
                    result_set.getString("info")
                );
                dados.add(prof);
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao buscar todos os dados" + ex.toString());
        }
        finally{   
            ConnectorFactory.closeConn(conn, stmt);
        }   
        return dados;
    }
}
