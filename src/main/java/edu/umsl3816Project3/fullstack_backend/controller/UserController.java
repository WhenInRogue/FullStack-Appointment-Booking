
package edu.umsl3816Project3.fullstack_backend.controller;

import edu.umsl3816Project3.fullstack_backend.exception.UserNotFoundException;
import edu.umsl3816Project3.fullstack_backend.model.User;
import edu.umsl3816Project3.fullstack_backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author theza
 */

//@RestController combines @Controller and @ResponseBody
@RestController
//@CrossOrigin allows a web page to access resources from a different domain than the one that served the page. Works at the class level
@CrossOrigin("http://localhost:3000")
public class UserController 
{
    //Autowired allows Spring to automatically wire the required beans (dependencies) into my classes
    @Autowired
    private UserRepository userRepository;
    
    //@PostMapping sends the Post request to create/update server
    //Data sent to server with POST is stored in the request body of the HTTP request
    @PostMapping("/user")
    User newUser(@RequestBody User newUser)
    {
        return userRepository.save(newUser);
    }
    
    
    //@GetMapping sends Get Request
    @GetMapping("/users")
    List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id)
    {
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }
    
    
    //@PutMapping updates the user
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser,@PathVariable Long id)
    {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }
    
    
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id)
    {
        if(!userRepository.existsById(id))
        {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id"+id+"has been deleted successfully.";
    }
    
}
