/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.Prueba.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.Prueba.entity.Calificacion;
import pe.cibertec.ecommerce.Prueba.Repository.CalificacionRepository;

/**
 *
 * @author rjara
 */
@Service
public class calificacionServiceImpl implements CalificacionService{

    @Autowired
    private  CalificacionRepository calificacionRepository;
    
    
    @Override
    public Calificacion create(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> getCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> getCalificacionByUsuarioId(String usuarioId) {
        return calificacionRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Calificacion> getCalificacionByCafeteriaId(String cafeteriaId) {
        return calificacionRepository.findByCafeteriaId(cafeteriaId);
    }
    
}
