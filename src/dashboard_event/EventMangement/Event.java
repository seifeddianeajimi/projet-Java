/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.EventMangement;

import dashboard_event.UserManagment.User;

/**
 *
 * @author saifp
 */
public class Event {
    private int event_id;
    private String titre;
    private String description;
    private String date_debut;
    private String date_fin;
    private String location;
    private User organisateur;
    private int nbrdeplace;
      
    
    public Event(int event_id,String titre,String description,String date_debut,String date_fin,String location, User organisateur,int nbrdeplace){
        
    this.event_id=event_id;
    this.titre=titre;
    this.description=description;
    this.date_debut=date_debut;
    this.date_fin=date_fin;
    this.location=location;
    this.organisateur=organisateur;
    this.nbrdeplace=nbrdeplace;
  }
    public int getevent_id(){
        return this.event_id;       
    }
    public String gettitre(){
        return this.titre;
    }
    public String getdescription(){
        return this.description;
    }
    public String getdate_debut(){
        return this.date_debut;
    }
    public String getdate_fin(){
        return this.date_fin;
    }
    public String getlocation(){
        return this.location;
    }
    public int getnbrdeplace(){
        return this.nbrdeplace;
    }
    public void setevent_id(int id){
        this.event_id=id;
    }
    public void settitre(String titre){
        this.titre=titre;
    }
    public void setdescription(String desc){
        this.description=desc;
    }
    public void setdate_debut(String date_deb){
        this.date_debut=date_deb;
    }
    public void setdate_fin(String date_fin){
        this.date_fin=date_fin;
    }
    public void setnbrdeplace(int nbrdeplace){
        this.nbrdeplace=nbrdeplace;
    }
    
    
    public String tostring (){
        return "Event[" +
                "event_id=" + event_id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_debut='" + date_debut + '\'' +
                ", date_fin='" + date_fin + '\'' +
                ", location='" + location + '\'' +
                ", organisateur=" + organisateur +
                ", nbrdeplace=" + nbrdeplace +
                ']';
    } 
    
}       

