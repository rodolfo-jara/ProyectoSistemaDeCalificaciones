/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCafeteria.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCafeteria.entity.Cafeteria;
import pe.cibertec.ecommerce.ApiCafeteria.exceptions.ResourceNotFoundException;
import pe.cibertec.ecommerce.ApiCafeteria.repository.CafeteriaRepository;

/**
 *
 * @author rjara
 */
@Service
public class CafeteriaServiceImpl implements CafeteriaService{

    @Autowired
    private CafeteriaRepository cafeteriaRepository;
    
    
    @Override
    public Cafeteria create(Cafeteria cafeteria) {
        return  cafeteriaRepository.save(cafeteria);
    }

    @Override
    public List<Cafeteria> getAll() {
        return  cafeteriaRepository.findAll();
    }

    @Override
    public Cafeteria get(Long id) {
      return cafeteriaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Cafeteria con ID: " + id));
    }
    
}
