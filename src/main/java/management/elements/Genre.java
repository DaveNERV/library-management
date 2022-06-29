package management.elements;

import java.sql.*;
import management.utils.BDConnection;

public class Genre {
    private int id;
    private String genreName;

    public Genre(){}
    
    public Genre(int id, String genreName){
        this.id = id;
        this.genreName = genreName;
    }
    
    public int getId() {
        return id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
    
    public static int addGenre(Integer id, String genreName){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("INSERT INTO genuri VALUES (?, ?)");
            prepst.setObject(1, id, Types.INTEGER);
            prepst.setString(2, genreName);
              
            rowCount = prepst.executeUpdate();      
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
     
    public static int deleteGenre(int id){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("DELETE FROM genuri WHERE id_gen = ?");
            prepst.setInt(1, id);
            
            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
    
    public static int updateGenre(int id, String genreName){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("UPDATE genuri SET denumire_gen = ? WHERE id_gen = ?");
            prepst.setString(1, genreName);
            prepst.setInt(2, id);

            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
}
