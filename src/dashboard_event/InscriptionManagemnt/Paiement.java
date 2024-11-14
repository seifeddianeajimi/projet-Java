/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.InscriptionManagemnt;

/**
 *
 * @author saifp
 */
import java.util.Date;
public class Paiement {
    private int idPaiement;
    private Participant participant;
    private double montant;
    private String statut; // ex : "Payé", "En attente", "Échec"
    private Date datePaiement;
    public Paiement(int idPaiement, Participant participant, double montant, String statut, Date datePaiement) {
        this.idPaiement = idPaiement;
        this.participant = participant;
        this.montant = montant;
        this.statut = statut;
        this.datePaiement = datePaiement;
    }
     public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Participant getParticipant() {
        return participant;
    }
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
      public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }
     @Override
    public String toString() {
        return "Paiement **ID=" + idPaiement + ", Participant=" + participant + ", Montant=" + montant + ", Statut=" + statut + ", Date=" + datePaiement + "**";
    }
}