package management.elements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import management.utils.BDConnection;

public class Faculty {
    private Integer idFaculty;
    private String facultyName;

    public Faculty(Integer idFaculty, String facultyName){
        this.idFaculty = idFaculty;
        this.facultyName = facultyName;
    }
    
    public int getIdFaculty() {
        return idFaculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    
    public int addFaculty(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("INSERT INTO facultati VALUES (?, ?)");
            prepst.setObject(1, idFaculty, Types.INTEGER);
            prepst.setString(2, facultyName);
              
            rowCount = prepst.executeUpdate();      
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
     
    public int deleteFaculty(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("DELETE FROM facultati WHERE id_facultate = ?");
            prepst.setInt(1, idFaculty);
            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
    
    public int updateFaculty(){
        int rowCount = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("UPDATE facultati SET numele_facultate = ? WHERE id_facultate = ?");
            prepst.setString(1, facultyName);
            prepst.setInt(2, idFaculty);

            rowCount = prepst.executeUpdate(); 
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rowCount;
    }
}
