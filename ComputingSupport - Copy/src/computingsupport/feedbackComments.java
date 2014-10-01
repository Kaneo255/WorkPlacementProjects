/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computingsupport;

/**
 *
 * @author James Cosgrave
 */
public class feedbackComments {
    private String feedbackText;
    private String Name;
  
    
    public feedbackComments(){
        feedbackText = new String();
        Name = new String();
    
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    
    
}