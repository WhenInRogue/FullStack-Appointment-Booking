
package edu.umsl3816Project3.fullstack_backend.controller;

import edu.umsl3816Project3.fullstack_backend.model.Appointment;
import edu.umsl3816Project3.fullstack_backend.repository.AppointmentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author theza
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class AppointmentController 
{
    @Autowired
    private AppointmentRepository appointmentRepository;
    
    
    @PostMapping("/appointment")
    Appointment newAppointment(@RequestBody Appointment newAppointment)
    {
        return appointmentRepository.save(newAppointment);
    }
    
    @GetMapping("/appointments")
    List<Appointment> getAllAppointments()
    {
        return appointmentRepository.findAll();
    }
}
