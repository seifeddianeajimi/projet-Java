/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.InscriptionManagemnt;

/**
 *
 * @author saifp
 */
public class Participant {
    private int idParticipant;
    private String nom;
    private String prenom;
    private String email;
    private int telephone;
     public Participant(int idParticipant, String nom, String prenom, String email, int tel) {
        this.idParticipant = idParticipant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = tel;
    }
      public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return "Participant [ID=" + idParticipant + ", Nom=" + nom + ", Prénom=" + prenom + 
               ", Email=" + email + ", Téléphone=" + telephone + "]";
    }
}
