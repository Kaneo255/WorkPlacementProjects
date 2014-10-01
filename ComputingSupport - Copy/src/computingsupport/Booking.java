/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author Ryan.S
 */
public class Booking {
    public String name;
    public String module; 
    public String studentNumber;
    public String problemArea;
    
    public Booking(){
        name = new String();
        module = new String();
        studentNumber = new String();
        problemArea = new String();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getModule(){
        return module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }
    
    public String getStudentNumber(){
        return studentNumber;
    }
    
    public void setStudentNumber(String StudentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public String getProblemArea(){
        return problemArea;
    }
    
    public void setProblemArea(String problemArea) {
        this.problemArea = problemArea;
    }
    
}
    
        
        
    
    
    
    



