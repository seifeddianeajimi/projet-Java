/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard_event.UserManagment;

/**
 *
 * @author saifp
 */
public class Task {
    private int IDTask;
    private String Description;
    private String StatutTask;
    public Task(int IDTask,String Description,String StatutTask){
        this.Description=Description;
        this.IDTask=IDTask;
        this.StatutTask=StatutTask;}
    @Override
    public String toString() {
        return "Tâche [IDTask=" + IDTask + 
               ", Description='" + Description + '\'' + 
               ", StatutTask='" + StatutTask + '\'' + 
               "]";
    }
    public int getIDTask() {
        return IDTask;
    }

    public String getDescription() {
        return Description;
    }

    public String getStatutTask() {
        return StatutTask;
    }
    public void setIDTask(int IDTask) {
        this.IDTask = IDTask;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    public void setStatutTask(String StatutTask) {
        this.StatutTask = StatutTask;
    }

    public boolean estComplete() {
        return "Terminé".equalsIgnoreCase(this.StatutTask);
    }
    
}

