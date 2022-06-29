package management.elements;

public class Student {
    private int studentId;
    private String studentFirstName, studentLastName, genre, group, faculty, email; 
    
    Student(int studentId, String studentFirstName, String studentLastName, String genre, String group, String faculty, String email){
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.genre = genre;
        this.group = group;
        this.faculty = faculty;
        this.email = email;
    }
    
    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getGenre() {
        return genre;
    }

    public String getGroup() {
        return group;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
