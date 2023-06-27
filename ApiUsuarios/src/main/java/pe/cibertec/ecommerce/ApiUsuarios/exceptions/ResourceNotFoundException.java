/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.exceptions;

/**
 *
 * @author rjara
 */
public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException() {
        super("Recurso no encontrado en el servidor !!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
