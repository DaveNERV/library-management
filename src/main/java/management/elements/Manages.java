package management.elements;

import java.sql.*;
import java.util.*;
import management.utils.BDConnection;

//это вспомогательный класс со статичными методами
public class Manages {
    
    public static List<Genre> getGenresListFromBD(){
        List<Genre> genres = new ArrayList<>();
        Genre genre;
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM genuri");
            while(rs.next()){
                genre = new Genre(rs.getInt("id_gen"), rs.getString("denumire_gen"));
                genres.add(genre);    
            }      
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return genres;
    }
    
    public static List<Author> getAuthorsListFromBD(){
        List<Author> authors = new ArrayList<>();
        Author author;
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM autori");
            while(rs.next()){
                author = new Author(rs.getInt("id_autor"), rs.getString("nume_autor"), rs.getString("prenume_autor"));
                authors.add(author);    
            }      
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return authors;
    }
    
    public static List<Book> getBooksListFromBD(){
        List<Book> books = new ArrayList<>();
        Book book;
        
        List<String> authorsOfBook = new ArrayList<>();
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st1 = connection.createStatement();
            ResultSet rsBooks = st1.executeQuery("SELECT c.id_carte, c.ISBN, c.denumire_carte, g.denumire_gen, c.editor, c.nr_carti "
                    + "FROM carti c INNER JOIN genuri g USING(id_gen)");
            PreparedStatement prepstAuthors = connection.prepareStatement("SELECT CONCAT(a.nume_autor, ' ', a.prenume_autor) as autor "
                    + "FROM carti c INNER JOIN autorii_cartilor ac ON c.id_carte = ac.id_carte "
                    + "INNER JOIN autori a ON a.id_autor = ac.id_autor WHERE ac.id_carte = ?");
            while(rsBooks.next()){
                int bookId = rsBooks.getInt("id_carte");
                prepstAuthors.setInt(1, bookId);
                ResultSet rsAuthors = prepstAuthors.executeQuery();
                
                while(rsAuthors.next()){
                    authorsOfBook.add(rsAuthors.getString("autor"));
                }

                book = new Book(bookId, rsBooks.getString("denumire_carte"), rsBooks.getString("editor"), 
                        rsBooks.getString("denumire_gen"), rsBooks.getString("ISBN"), 
                        authorsOfBook, rsBooks.getInt("nr_carti"));
                books.add(book);
                authorsOfBook = new ArrayList<>();
            }       
        }catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return books;
    } 
    
    public static List<Student> getStudentsListFromBD(){
        List<Student> students = new ArrayList<>();
        Student student;
        
        List<String> authorsOfBook = new ArrayList<>();
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM studenti INNER JOIN facultati USING(id_facultate)");
            while(rs.next()){
                student = new Student(rs.getInt("id_studentului"), rs.getString("numele"), rs.getString("prenumele"), 
                        rs.getString("genul"), rs.getString("grupa"), rs.getString("numele_facultate"), rs.getString("email"));
                
                students.add(student);
                authorsOfBook = new ArrayList<>();
            }   
        }catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return students;
    } 
    
    public static List<Faculty> getFacultiesListFromBD(){
        List<Faculty> faculties = new ArrayList<>();
        Faculty faculty;
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM facultati");
            while(rs.next()){
                faculty = new Faculty(rs.getInt("id_facultate"), rs.getString("numele_facultate"));
                faculties.add(faculty);
            }   
        }catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return faculties;
    } 
    
    public static Book getBook(List<Book> books, int i){
        for(Book book : books){
            if(book.getBookId() == i){
               return book;         
            }
        }
        return null;
    } 
    
    
    public static Book getBook(int i){
        List<Book> books = getBooksListFromBD();
        
        for(Book book : books){
            if(book.getBookId() == i){
               return book;         
            }
        }
        return null;
    }
    
    public static Book getBook(Book b){
        List<Book> books = getBooksListFromBD();
        
        for(Book book : books){
            if(book.equals(b)){
               return book;         
            }
        }
        return null;
    }
    
    public static Student getStudent(List<Student> students, int i){
        for(Student student : students){
            if(student.getStudentId() == i){
               return student;         
            }
        }
        return null;
    } 
    
    
    public static Student getStudent(int i){
        List<Student> students = getStudentsListFromBD();
        
        for(Student student : students){
            if(student.getStudentId() == i){
               return student;         
            }
        }
        return null;
    }
}
