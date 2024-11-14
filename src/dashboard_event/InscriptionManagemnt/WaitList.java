/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.InscriptionManagemnt;

/**
 *
 * @author saifp
 */
import java.util.LinkedList;
import java.util.Queue;
public class WaitList {
    private Queue<Participant> listeAttente;
    public WaitList() {
        listeAttente = new LinkedList<>();
    }
    public void ajouterEnAttente(Participant par) {
        listeAttente.add(par);
    }
    public Participant retirerDeLaListe() {
        return listeAttente.poll();
    }
    public void afficherListeAttente() {
        System.out.println("Liste d'attente :");
        for (Participant p : listeAttente) {
            System.out.println(p);
        }
    }
    public boolean estVide() {
        return listeAttente.isEmpty();
    }

    
}
