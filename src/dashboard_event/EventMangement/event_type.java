/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.EventMangement;

/**
 *
 * @author saifp
 */
import dashboard_event.EventMangement.Event;
import java.util.Vector;

public class event_type {
    
    private int type_id;
    private String type_name;
    private String description;
    private Vector<Event> evenements;
    
    
    public event_type(int type_id,String type_name,String description){
        this.type_id=type_id;
        this.type_name=type_name;
        this.description=description;
        this.evenements = new Vector<>();
    }
    public int geteventtypeid(){
        return type_id;
    }
    public String gettypename(){
        return type_name;
    }
    public String getdescription(){
        return description;
    }
    public void settypeid(int id){
        this.type_id=id;
    }
    public void settypename(String name){
        this.type_name=name;
    }
    public void setdescription(String desc){
        this.description=desc;
    }
    public void ajouterevent(Event ev){
        evenements.add(ev);
    }
    public void supprimerevent(int id){
       evenements.removeIf(event->event.getevent_id()==id);
    }
}

