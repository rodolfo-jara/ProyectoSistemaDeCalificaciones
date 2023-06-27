/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCafeteria.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCafeteria.entity.Cafeteria;

/**
 *
 * @author rjara
 */
public interface CafeteriaService {
    Cafeteria create(Cafeteria cafeteria);
    List<Cafeteria> getAll();
    Cafeteria get(Long id);
}
