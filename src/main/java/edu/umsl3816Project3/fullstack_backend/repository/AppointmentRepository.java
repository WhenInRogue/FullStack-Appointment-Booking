
package edu.umsl3816Project3.fullstack_backend.repository;

import edu.umsl3816Project3.fullstack_backend.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author theza
 */
public interface AppointmentRepository extends JpaRepository<Appointment,Long>
{
    
}
