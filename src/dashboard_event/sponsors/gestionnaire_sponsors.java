/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.sponsors;

/**
 *
 * @author saifp
 */
import java.util.Vector;

public class gestionnaire_sponsors {
    private Vector<contrat> contrats;
     
    
    public gestionnaire_sponsors(){
        this.contrats=new Vector<>();
    }
    public void ajoutercontrat(contrat c){
        contrats.add(c);
    }
    public void supprimercontrat(int id ){
        contrats.removeIf(contrat->contrat.getcontratid()==id);
    }
}

