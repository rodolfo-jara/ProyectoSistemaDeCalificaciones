/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiUsuarios.entity.Usuario;

/**
 *
 * @author rjara
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
