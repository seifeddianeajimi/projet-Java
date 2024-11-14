/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.sponsors;

/**
 *
 * @author saifp
 */
public class sponsor {
    private int sponsor_id;
    private String sponsor_name;
    private String contact;
    private String niveau_sponsoring;
    
    
    
    public sponsor(int sponsor_id,String sponsor_name,String contact,String niveau_sponsoring){
        this.sponsor_id=sponsor_id;
        this.sponsor_name=sponsor_name;
        this.contact=contact;
        this.niveau_sponsoring=niveau_sponsoring;
    }
    public int getsponsorid() {
        return sponsor_id;
    }

    public String getsponsorname(){
        return sponsor_name;
    }
    public String getcontact(){
        return contact;
    }
    public String getniveausponsoring(){
        return niveau_sponsoring;
    }
    public void setsponsorid(int id){
        this.sponsor_id=id;
    }
    public void setsponsorname(String name){
        this.sponsor_name=name;
    }
    public void setcontact(String contact){
        this.contact=contact;
    }
    public void setniveausponsoring(String c){
        this.niveau_sponsoring=c;
    }
    public String tostring(){
        return "sponsor[" +
                "sponsor_id=" + sponsor_id +
                ", sponsor_name ='" + sponsor_name + '\'' +
                ", contact ='" + contact + '\'' +
                ", niveau_sponsoring='" + niveau_sponsoring +
                ']';
    }
}