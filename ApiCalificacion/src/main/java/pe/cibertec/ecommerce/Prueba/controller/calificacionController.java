/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.Prueba.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.Prueba.entity.Calificacion;
import pe.cibertec.ecommerce.Prueba.services.CalificacionService;

/**
 *
 * @author rjara
 */
@RestController
    @RequestMapping("/calificacion")
public class calificacionController {
    @Autowired
    private CalificacionService calificacionService;
    
    @PostMapping
    public  ResponseEntity<Calificacion> guardarCalificacion(@RequestBody Calificacion calificacions){
        Calificacion cali = calificacionService.create(calificacions);
        return ResponseEntity.status(HttpStatus.CREATED).body(cali);
    }
    @GetMapping
    public  ResponseEntity<List<Calificacion>> listarCalificacion(){
        return ResponseEntity.ok(calificacionService.getCalificaciones());
    }
    
    
     @GetMapping("/usuarios/usuario/{usuarioId}")
     public ResponseEntity<List<Calificacion>> listarCalificacionesPorUsuarioId(@PathVariable String usuarioId){
         return ResponseEntity.ok(calificacionService.getCalificacionByUsuarioId(usuarioId));
     }
         @GetMapping("{cafeteriaId}")
     public ResponseEntity<List<Calificacion>> listarCalificacionesPorCafeteriaId(@PathVariable String cafeteriaId){
         return ResponseEntity.ok(calificacionService.getCalificacionByCafeteriaId(cafeteriaId));
     }
}
