
package edu.umsl3816Project3.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author theza
 */
@Entity
public class Appointment 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentID;
    private String startTime;
    private String endTime;
    private String date;
    //@ManyToOne(fetch = FetchType.LAZY)//I use .LAZY so that we load the relationship but not the entire object (saves memory and performance).
    //@JoinColumn(name = "user_id")//This assigns the Foreign Key
    //private User user;
    
    //Important Info:
    //You might need to use the cascade attribute of the @ManyToOne annotation to define how operations on the parent entity should be cascaded to the child entity.
    //For example, if you delete a parent, you might want to cascade the deletion to its children
    //
    //You can control how the child entity is fetched using the fetch attribute. The default is FetchType.EAGER, which loads the child entity along with the parent.
    //If you want to load the child entity lazily, use FetchType.LAZY
    
    //Getters and Setters

    public Long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
    
    
    
}
