/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author James Cosgrave
 */
public class Request {

    private String Module;
    private String Lecturer;
    private String Topic;
    private String Week;
    private String StudentID;
    private int count;

    public Request() {
        Module = new String();
        Lecturer = new String();
        Topic = new String();
        Week = new String();
        StudentID = new String();
        count = 0;
    }

    public void setModule(String Module) {
        this.Module = Module;
    }

    public void setLecturer(String Lecturer) {
        this.Lecturer = Lecturer;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public void setWeek(String Week) {
        this.Week = Week;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getModule() {
        return Module;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public String getTopic() {
        return Topic;
    }

    public String getWeek() {
        return Week;
    }

    public String getStudentID() {
        return StudentID;
    }
}
