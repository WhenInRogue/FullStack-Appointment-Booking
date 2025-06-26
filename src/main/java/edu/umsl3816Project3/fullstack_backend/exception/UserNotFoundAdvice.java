
package edu.umsl3816Project3.fullstack_backend.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author theza
 */

//@ControllerAdvice allows us to consolidate our multiple, scattered @ExceptionHandlers
//into a single, global error handling componet.
@ControllerAdvice
public class UserNotFoundAdvice 
{
    @ResponseBody
    //Exception Handlers are ways to catch and handle errors during program execution
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(UserNotFoundException exception)
    {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());
        
        return errorMap;
    }
}
