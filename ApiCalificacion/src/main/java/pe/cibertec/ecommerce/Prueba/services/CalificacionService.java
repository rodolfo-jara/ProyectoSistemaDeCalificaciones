/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.Prueba.services;

import java.util.List;
import pe.cibertec.ecommerce.Prueba.entity.Calificacion;

/**
 *
 * @author rjara
 */
public interface CalificacionService {
    Calificacion create(Calificacion calificacion);
    List<Calificacion> getCalificaciones();
    
    List<Calificacion> getCalificacionByUsuarioId(String usuarioId);
    List<Calificacion> getCalificacionByCafeteriaId(String cafeteriaId);
}
