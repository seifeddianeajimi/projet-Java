/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.EventMangement;

/**
 *
 * @author saifp
 */
import java.util.Date;
    
    

public class programme  {
    private int calendrier_id;
    private int event_id;
    private String details_session;
    private Date debut_session;
    private Date fin_session;

    public programme(int calendrier_id, int event_id,String details_session,Date debut_session,Date fin_session) {
        this.calendrier_id = calendrier_id;
        this.event_id = event_id;
        this.details_session = details_session;
        this.debut_session=debut_session;
        this.fin_session=fin_session;
    }

    public int getcalendrierid() {
        return calendrier_id;
    }

    public void setcalendrierid(int calendrier_id) {
        this.calendrier_id= calendrier_id;
    }

    public int geteventid() {
        return event_id;
    }

    public void seteventid(int event_id) {
        this.event_id = event_id;
    }

    public String getdetailssession() {
        return details_session;
    }

    public void setdetailssession(String details_session) {
        this.details_session = details_session;
    }

    public Date getdebubtsession() {
        return debut_session;
    }

    public void setdebutsession(Date debut_session) {
        this.debut_session = debut_session;
    }
    
    public Date getfinsession(){
        return fin_session;
    }
    public void setfinsession(Date fin_session){
        this.fin_session=fin_session;
    }
    public String tostring(){
        return "programme[" +
                "calendrier_id=" + calendrier_id +
                ", event_id ='" + event_id + '\'' +
                ", details_session ='" + details_session + '\'' +
                ", debut_session='" + debut_session + '\'' +
                ", fin_session='" + fin_session + '\'' +
                ']';
    }
    
}


