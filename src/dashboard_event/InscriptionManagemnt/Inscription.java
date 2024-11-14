/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.InscriptionManagemnt;

/**
 *
 * @author saifp
 */
import dashboard_event.EventMangement.Event;

public class Inscription {
    private int IDInscription;
    private Event evenement;
    private String StatutInscrit;
    private Participant participant;
    
    public Inscription(int idInscription, Participant participant, Event evenement) {
        this.IDInscription = idInscription;
        this.participant = participant;
        this.evenement = evenement;
    }
     public int getIdInscription() {
        return IDInscription;
    }

    public void setIdInscription(int idInscription) {
        this.IDInscription = idInscription;
    }

    public Participant getParticipant() {
        return participant;
    
}
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Event getEvenement() {
        return evenement;
}
     public void setEvenement(Event evenement) {
        this.evenement = evenement;
    }
      @Override
    public String toString() {
        return "Inscription *ID=" + IDInscription + ", Participant=" + participant + ", Evenement=" + "*";
    }
}
