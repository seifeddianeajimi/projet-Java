/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.sponsors;

/**
 *
 * @author saifp
 */
import dashboard_event.EventMangement.Event;
import java.util.Date;


public class contrat {
    private int contrat_id;
    private sponsor sponsor;
    private Event event;
    private double montant;
    private String terms;
    private Date date_debut;
    private Date date_fin;
    private String type_avantage;
    
    
    public contrat(int contrat_id,sponsor sponsor,Event event,double montant,String terms,Date date_debut,Date date_fin,String type_avantage){
        this.contrat_id=contrat_id;
        this.sponsor=sponsor;
        this.event=event;
        this.montant=montant;
        this.terms=terms;
        this.date_debut=date_debut;
        this.date_fin=date_fin;
        this.type_avantage=type_avantage;
    }
    public int getcontratid(){
        return contrat_id;
    }
    public sponsor getsponsor(){
        return sponsor;
    }
    public Event getevent(){
        return event;
    }
    public double getmontant(){
        return montant;
    }
    public String getterms(){
        return terms;
    }
    public Date getdatedebut(){
        return date_debut;
    }
    public Date getfatefin(){
        return date_fin;
    }
    public String gettypeavantage(){
        return type_avantage;
    }
    
    public void setcontratid(int id ){
        this.contrat_id=id;
    }
    public void setsposor(sponsor sponsor){
        this.sponsor=sponsor;
    }
    public void setevent(Event event){
        this.event=event;
    }
    public void setmontant(double m){
        this.montant=m;
    }
    public void setterms(String terms){
        this.terms=terms;
    }
    public void setdatedebut(Date d){
        this.date_debut=d;
    }
    public void setdatefin(Date f){
        this.date_fin=f;
    }
    public void settypeavantage(String av){
        this.type_avantage=av;
    }
    public String tostring (){
        return "contrat[" +
                "contrat_id=" + contrat_id +
                ", sponsor='" + sponsor + '\'' +
                ", event='" + event + '\'' +
                ", montant='" + montant + '\'' +
                ", terms='" + terms + '\'' +
                ", date_debut='" + date_debut + '\'' +
                ", date_fin=" + date_fin +
                ", type_avantage=" + type_avantage +
                ']';
    } 
}