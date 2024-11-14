/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.UserManagment;

/**
 *
 * @author saifp
 */
public class User {
    private int IDUser;
    private String Nom;
    private String Prenom;
    private String email;
    private int tel;
    private String Statut;
    private String password;
    private String Role;
    private boolean isConnected; 
    public User(int IDUser,String Nom,String Prenom,String email,int tel,String Statut, String password,String Role){
        this.IDUser=IDUser;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.email=email;
        this.tel=tel;
        this.Statut=Statut;
        this.password=password;
         this.Role=Role;}
    public int getIDUser() { return IDUser; }
    public String getNom() { return Nom; }
    public void setNom(String nom) { this.Nom = nom; }
    public String getPrenom() { return Prenom; }
    public void setPrenom(String prenom) { this.Prenom = prenom; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getTel() { return tel; }
    public void setTel(int tel) { this.tel = tel; }
    public String getStatut() { return Statut; }
    public void setStatut(String statut) { this.Statut = statut; }
    public String getRole() { return Role; }
    public void setRole(String role) { this.Role = role; }
        @Override
    public String toString() {
        return "Utilisateur{" +
                "IDUser=" + IDUser +
                ", Nom='" + Nom + '\'' +
                ", Prénom='" + Prenom + '\'' +
                ", Email='" + email + '\'' +
                ", Téléphone=" + tel +
                ", Statut='" + Statut + '\'' +
                ", Rôle dans l'équipe='" + Role + '\'' +
                '}';}
        public boolean seConnecter(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.isConnected = true;
            System.out.println(Nom + " est connecté(e).");
            return true;
        } else {
            System.out.println("Échec de la connexion.");
            return false;
        }
        }
        public void seDeconnecter() {
        if (isConnected) {
            this.isConnected = false;
            System.out.println(Nom + " est déconnecté(e).");
        } else {
            System.out.println("Utilisateur déjà déconnecté.");
        }
    }
            public boolean estConnecte() {
        return isConnected;
    }
      public void modifierProfil(String nouveauNom, String nouveauPrenom, String nouvelEmail, int nouveauTel, String nouveauStatut, String nouveauRole) {
        this.Nom = nouveauNom;
        this.Prenom = nouveauPrenom;
        this.email = nouvelEmail;
        this.tel = nouveauTel;
        this.Statut = nouveauStatut;
        this.Role = nouveauRole;
        System.out.println("Profil mis a jour avec succes !");
    }
       public boolean changerMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        if (this.password.equals(ancienMotDePasse)) {
            this.password = nouveauMotDePasse;
            System.out.println("Mot de passe modifié avec succès !");
            return true;
        } else {
            System.out.println("Échec : Ancien mot de passe incorrect.");
            return false;
        }
    }
            

    }
