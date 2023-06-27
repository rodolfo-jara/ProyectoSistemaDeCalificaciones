/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCafeteria.controller;

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
import pe.cibertec.ecommerce.ApiCafeteria.entity.Cafeteria;
import pe.cibertec.ecommerce.ApiCafeteria.service.CafeteriaService;

/**
 *
 * @author rjara
 */
@RestController
@RequestMapping("/Cafeteria")
public class CafeteriaController {
    @Autowired
    private CafeteriaService cafeteriaService;
    
    @PostMapping
    public  ResponseEntity<Cafeteria> guardarCafeteria(@RequestBody Cafeteria cafeteria){
        return ResponseEntity.status(HttpStatus.CREATED).body(cafeteriaService.create(cafeteria));
    }
    @GetMapping
    public  ResponseEntity<List<Cafeteria>> listarCafeteria(){
        return ResponseEntity.status(HttpStatus.CREATED).body(cafeteriaService.getAll());
    }   
    @GetMapping("/{cafeteriaId}")
    public ResponseEntity<Cafeteria> obtenerCafeteria(@PathVariable Long cafeteriaId){
        return  ResponseEntity.status(HttpStatus.CREATED).body(cafeteriaService.get(cafeteriaId));
    }
}
