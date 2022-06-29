package management.elements;

import java.util.List;
import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName, editura, gen, ISBN; 
    private List<String> authors;

    Book(){}
    
    Book(int bookId, String bookName, String editura, String gen, String ISBN, List<String> authors, int nr){
        this.bookId = bookId;
        this.bookName = bookName;
        this.gen = gen;
        this.editura = editura;
        this.ISBN = ISBN;
        this.authors = authors;
    }
    
    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getEditura() {
        return editura;
    }

    public String getGen() {
        return gen;
    }

    public String getISBN() {
        return ISBN;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setBookId(Integer book_id) {
        this.bookId = book_id;
    }

    public void setBookName(String book_name) {
        this.bookName = book_name;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.bookId;
        hash = 37 * hash + Objects.hashCode(this.bookName);
        hash = 37 * hash + Objects.hashCode(this.editura);
        hash = 37 * hash + Objects.hashCode(this.gen);
        hash = 37 * hash + Objects.hashCode(this.ISBN);
        hash = 37 * hash + Objects.hashCode(this.authors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.bookId != other.bookId) {
            return false;
        }
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.editura, other.editura)) {
            return false;
        }
        if (!Objects.equals(this.gen, other.gen)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return Objects.equals(this.authors, other.authors);
    }
}
