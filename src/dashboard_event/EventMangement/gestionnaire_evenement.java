/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.EventMangement;

/**
 *
 * @author saifp
 */
import java.util.ArrayList;


public class gestionnaire_evenement {
     private ArrayList<Event> listevent;
     private ArrayList<event_feedback> listfeedback;
     public gestionnaire_evenement(){
         listevent =new ArrayList();
         listfeedback=new ArrayList();
         
     }
     public void ajouterevent(Event event){
         listevent.add(event);
}
     public void supprimerevent(int id ){
         listevent.removeIf(ev -> ev.getevent_id() ==id);
     }
     public Event getDetailsEvenement(int id) {
        for (Event evenement : listevent) {
            if (evenement.getevent_id() == id) {
                return evenement;
            }
        }
        return null; 
    }
     public void ajouterFeedback(event_feedback feedback) {
         listfeedback.add(feedback);
     }
    public event_feedback getDetailsfeedback(int id){
        for(event_feedback event_feedback : listfeedback){
           if(event_feedback.getfeedbackid() ==id){
               return event_feedback;
           }   
        }
         return null;
    }
}

