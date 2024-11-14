/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.EventMangement;

/**
 *
 * @author saifp
 */
public class event_feedback {
    private static int nextid=1;
    private int feedback_id;
    private int event_id;
    private int user_id;
    private String commentaire;
    
    public event_feedback(int event_id , int user_id , String commentaire){
        this.feedback_id=nextid++;
        this.event_id=event_id;
        this.user_id=user_id;
        this.commentaire=commentaire;
    }
    
    public void setfeedbackid(int feedback_id){
        this.feedback_id=feedback_id;
    }
    public void seteventid(int event_id ){
        this.event_id=event_id;
    }
    public void setuserid(int user_id){
        this.user_id=user_id;
    }
    public void setcommentaire(String commentaire){
        this.commentaire=commentaire;
    }
    public int getfeedbackid(){
        return feedback_id;
    }
    public int geteventid(){
        return event_id;
    }
    public int getuserid(){
        return user_id;
    }
    public String getcommentaire(){
        return commentaire;
    }
    public void soumettrefeedback() {
        // mithel base de donnees 
        System.out.println("feedback soumis : " + commentaire);
    }
    
    public String tostring(){
        return "event feedback[" +
                "feedback_id=" + feedback_id +
                ", event_id ='" + event_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ']';
    }
}
