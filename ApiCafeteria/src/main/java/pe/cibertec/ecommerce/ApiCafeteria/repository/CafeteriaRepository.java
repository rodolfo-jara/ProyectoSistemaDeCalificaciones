/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCafeteria.entity.Cafeteria;

/**
 *
 * @author rjara
 */
public interface CafeteriaRepository extends JpaRepository<Cafeteria, Long>{
    
}
