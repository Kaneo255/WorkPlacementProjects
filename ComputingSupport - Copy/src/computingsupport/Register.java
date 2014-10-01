/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

import java.io.Serializable;

/**
 *
 * @author James Cosgrave
 */
public class Register implements Serializable{

    private String firstName;
    private String Surname;
    private String Course;
    private String StudentNumber;

    public Register() {
        firstName = new String();
        Surname = new String();
        Course = new String();
        StudentNumber = new String();

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public String getCourse() {
        return Course;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }
}
