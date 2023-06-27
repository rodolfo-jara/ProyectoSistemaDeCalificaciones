/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.Prueba.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.Prueba.entity.Calificacion;

/**
 *
 * @author rjara
 */
public interface CalificacionRepository extends JpaRepository<Calificacion,Long>{
    
    List<Calificacion> findByUsuarioId(String usuarioId);
    List<Calificacion> findByCafeteriaId(String cafeteriaId);
}
