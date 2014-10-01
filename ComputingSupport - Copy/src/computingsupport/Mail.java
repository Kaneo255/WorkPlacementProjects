/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;
import java.io.Serializable;
/**
 *
 
 */
public class Mail implements Serializable {

    private String Name;
    private String Assistance;
    private String StudentID;
    private String To;
    private String Subject;
    private String Mail;
    private int count;

    public Mail() {

        Name = new String();
        Assistance = new String();
        StudentID = new String();
        To = new String();
        Subject = new String();
        Mail = new String();
        count = 0;

    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAssistance(String Assistance) {
        this.Assistance = Assistance;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getName() {
        return Name;
    }

    public String getAssistance() {
        return Assistance;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getTo() {
        return To;
    }

    public String getSubject() {
        return Subject;
    }

    public String getMail() {
        return Mail;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    
    
}
