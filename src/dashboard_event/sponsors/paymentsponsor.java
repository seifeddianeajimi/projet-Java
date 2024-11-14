/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.sponsors;

/**
 *
 * @author saifp
 */
import java.util.Date;
import dashboard_event.EventMangement.Event;
public class paymentsponsor {
    private int payment_id;
    private sponsor sponsor;
    private Event event;
    private Date date_payment;
    
    public paymentsponsor(int payment_id, sponsor sponsor,Event event,Date date_payment){
        this.payment_id=payment_id;
        this.sponsor=sponsor;
        this.event=event;
        this.date_payment=date_payment;
    }
    
    public int getpaymentid(){
        return payment_id;
    }
    public sponsor getsponsor(){
        return sponsor;
    }
    public Event getevent(){
        return event;
    }
    public Date getdatepayment(){
        return date_payment;
    }
    public void setpaymentid(int p){
        this.payment_id=p;
    }
    public void setsponsor(sponsor s){
        this.sponsor=s;
    }
    public void setevent(Event e){
        this.event=e;
    }
    public void setdatepayment(Date d){
        this.date_payment=d;
    }
    public String tostring (){
        return "paymentsponsor[" +
                "payment_id=" + payment_id +
                ", sponsor='" + sponsor + '\'' +
                ", event='" + event + '\'' +
                ", date_payment='" + date_payment +
                ']';
    } 
}
