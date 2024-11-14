/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.UserManagment;

/**
 *
 * @author saifp
 */
import java.util.ArrayList;
public class Team {
    private String Departement;
    private ArrayList<User>Membres;
    private ArrayList<Task>Taches;
    public Team(String Departement){
        this.Departement=Departement;
        Membres=new ArrayList<>();
        Taches=new ArrayList<>();
        
    }
     public String getDepartement() {
        return Departement;
    }

    public void setDepartement(String departement) {
        this.Departement = departement;
    }
    public ArrayList<User> getMembres() {
        return Membres;
    }

    public void setMembres(ArrayList<User> membres) {
        this.Membres = membres;
    }
       public ArrayList<Task> getTaches() {
        return Taches;
    }

    public void setTaches(ArrayList<Task> taches) {
        this.Taches = taches;
    }
    public void ajouterMembre(User membre) {
        Membres.add(membre);
    }

    public void retirerMembre(User membre) {
        Membres.remove(membre);
    }
   public void ajouterTache(Task tache) {
        Taches.add(tache);
    }

    public void retirerTache(Task tache) {
        Taches.remove(tache);
    }
        public int compterMembres() {
        return Membres.size();
    }

 
    public int compterTaches() {
        return Taches.size();
    }
}
