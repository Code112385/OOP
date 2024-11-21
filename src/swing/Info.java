/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/**
 *
 * @author senju
 */
public class Info {

    private String picture;
    private String studentId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private String course;
    private String year;
    private String section;

    // Constructor
    public Info(String picture, String studentId, String lastName, String firstName, String middleName, String gender, String course, String year, String section) {
        this.picture = picture;
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.course = course;
        this.year = year;
        this.section = section;
    }

    // Getters
    public String getPicture() {
        return picture;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getYear() {
        return year;
    }

    public String getSection() {
        return section;
    }
    
    public void setpic(String pic){
        this.picture = pic;
    }
    public void setId(String id){
        this.studentId = id;
    }
    public void setfname(String fname){
        this.firstName = fname;
    }
    public void setlname(String lname){
        this.lastName = lname;
    }
    public void setmname(String mname){
        this.middleName = mname;
    }
    public void setgender(String gend){
        this.gender = gend;
    }
    public void setcourse(String cours){
        this.course = cours;
    }
    public void setyear(String year){
        this.year = year;
    }
    public void setsection(String section){
        this.section = section;
    }
    
}


