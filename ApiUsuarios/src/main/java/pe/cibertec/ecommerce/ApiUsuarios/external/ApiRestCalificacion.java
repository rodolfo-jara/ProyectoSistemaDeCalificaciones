/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiUsuarios.entity.Cafeteria;

/**
 *
 * @author rjara
 */
@FeignClient(name="apicalificacion")
public interface ApiRestCalificacion {
    @GetMapping("/calificacion/{cafeteriaId}")
    Cafeteria getCalificacion(@PathVariable String calificacionId);
}
