package model.sqlite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Veiculo;

public class VeiculoSQLite extends SQLiteBase {
    public VeiculoSQLite(){
        open();
        try {
           PreparedStatement stm =  conn.prepareStatement("CREATE TABLE IF NOT EXISTS Veiculos("+
           "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
           "marcca TEXT,"+
           "modelo TEXT,"+
           "hp INTEGER);");

           stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close();
        }
       
    }
    public void create(Veiculo v){
        open();
        try {
            PreparedStatement stm =  conn.prepareStatement("INSERT INTO Veiculos VALUE(?,?,?,?);");
            stm.setInt(2,v.getHp());
            stm.setString(3,v.getMarca());
            stm.setString(4,v.getModelo());    

            stm.executeUpdate();

         } catch (SQLException e) {
             e.printStackTrace();
         }finally{
             close();
         }

    }
    
        public List<Veiculo>all(){
            ArrayList<Veiculo> result = new ArrayList<>();
            open();
            try {
                PreparedStatement stm =  conn.prepareStatement("SELECT * FROM Veiculo ORDER BY id ASC;");
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()) {
                    Veiculo v = new Veiculo(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4) );
                    result.add(v);
                }
                
    
                stm.executeUpdate();
    
             } catch (SQLException e) {
                 e.printStackTrace();
             }finally{
                 close();
             }
             return result;

             //javaFx 14 sqlite
        }
}
