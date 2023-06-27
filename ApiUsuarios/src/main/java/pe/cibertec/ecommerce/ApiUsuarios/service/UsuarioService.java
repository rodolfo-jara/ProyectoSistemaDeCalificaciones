/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.service;

import java.util.List;

import pe.cibertec.ecommerce.ApiUsuarios.entity.Usuario;

/**
 *
 * @author rjara
 */
public interface UsuarioService {
     Usuario saveUsuario(Usuario usuario);
     List<Usuario> getAllUsuarios();
     Usuario getUsuario(Long usuarioId);
}
