/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author James Cosgrave
 */
public class  ContactEmail {

    private String EmailAddress;
    private String Subject;
    private String Email;
    
    public  ContactEmail(){ 
    EmailAddress = new String();
    Subject = new String();
    Email = new String();
        
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getEmail() {
        return Email;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getSubject() {
        return Subject;
    }
    
    

}