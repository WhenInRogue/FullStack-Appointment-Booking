
package edu.umsl3816Project3.fullstack_backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theza
 */

//@Entity marks class as JPA entity
//This means that the class represents a table in the database, and its instances can be persisted, retrieved, updated, and deleted using JPA
@Entity
public class User 
{
    //@Id specifies the primary key
    @Id
    //@GeneratedValue tells JPA that the value for the primary key should be generated automatically
    //@GeneratedValue placed above the primary key
    @GeneratedValue//(strategy = GenerationType.IDENTITY)//.IDENTITY allows me to reuse ID numbers in different tables and columns
    private Long id;
    private String username;
    private String name;
    private String email;
    
    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)//CascadeType.ALL deletes appointment when I delete user(in addition to other CRUD functions).
    //public List<Appointment> appointments = new ArrayList<Appointment>();

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<Appointment> getAppointments() {
//        return appointments;
//    }
//
//    public void setAppointments(List<Appointment> appointments) {
//        this.appointments = appointments;
//    }
    
    
    
}
