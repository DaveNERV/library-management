package management.elements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import management.utils.BDConnection;

public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    
    public Author(Integer id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int addAuthor(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("INSERT INTO autori VALUES (?, ?, ?)");
            prepst.setObject(1, id, Types.INTEGER);
            prepst.setString(2, firstName);
            prepst.setString(3, lastName);
              
            rowCount = prepst.executeUpdate();      
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
     
    public int deleteAuthor(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("DELETE FROM autori WHERE id_autor = ?");
            prepst.setInt(1, id);
            
            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
    
    public int updateAuthor(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("UPDATE autori SET nume_autor = ?, prenume_autor = ? WHERE id_autor = ?");
            prepst.setString(1, firstName);
            prepst.setString(2, lastName);
            prepst.setInt(3, id);

            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
}
