
package edu.umsl3816Project3.fullstack_backend.exception;

/**
 *
 * @author theza
 */
public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(Long id)
    {
        super("Could not find the user with id: "+id);
    }
}
