/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.cibertec.ecommerce.ApiUsuarios.response.apiResponse;

/**
 *
 * @author rjara
 */
@RestControllerAdvice
public class GlobalExceptionController {
    
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<apiResponse> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        String mensaje = resourceNotFoundException.getMessage();
        
        apiResponse response = new apiResponse().builder()
                .message(mensaje)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();
          return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
     }
}
