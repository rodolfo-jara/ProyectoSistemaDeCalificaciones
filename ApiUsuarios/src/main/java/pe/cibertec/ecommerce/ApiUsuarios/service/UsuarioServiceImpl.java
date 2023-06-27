/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.service;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.cibertec.ecommerce.ApiUsuarios.entity.Cafeteria;
import pe.cibertec.ecommerce.ApiUsuarios.entity.Calificacion;
import pe.cibertec.ecommerce.ApiUsuarios.entity.Usuario;
import pe.cibertec.ecommerce.ApiUsuarios.exceptions.ResourceNotFoundException;
import pe.cibertec.ecommerce.ApiUsuarios.external.ApiRestCafeteria;
import pe.cibertec.ecommerce.ApiUsuarios.repository.UsuarioRepository;

/**
 *
 * @author rjara
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ApiRestCafeteria apiRestCafeteria;
    
    @Override
    public Usuario saveUsuario(Usuario usuario) {
         return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
        
    }

    @Override
    public Usuario getUsuario(Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(()->new ResourceNotFoundException("El Usuario con ID: " + usuarioId + "no encontrado"));
       
        Calificacion[] calificacionDelUsuario = restTemplate.getForObject("http://APICALIFICACION/calificacion/usuarios/usuario/"+usuario.getUsuarioId(), Calificacion[].class);
        logger.info("{}",calificacionDelUsuario);
        
        
        List<Calificacion> calificaciones  = Arrays.stream(calificacionDelUsuario).collect(Collectors.toList());
        
        List<Calificacion> listaCalificaciones = calificaciones.stream().map(calificacion -> {
        System.out.println(calificacion.getCafeterialId());
        String cafeteriaId = calificacion.getCafeterialId();
        if (cafeteriaId != null) {
            //ResponseEntity<Cafeteria> forEntity = restTemplate.getForEntity("http://localhost:8180/api/Cafeteria/" + calificacion.getCafeterialId(),Cafeteria.class);
            Cafeteria cafeteria = apiRestCafeteria.getCafeteria(calificacion.getCafeterialId());
            //logger.info("Respuesta con código de estado: {}", forEntity.getStatusCode());
            calificacion.setCafeteria(cafeteria);
            } else {
            
            // Manejar el caso en el que cafeteriaId es null
            // Puedes lanzar una excepción, mostrar un mensaje de error, etc.
        }
            
        return calificacion;

    }).collect(Collectors.toList());

    usuario.setCalificaciones(listaCalificaciones);
    return usuario;
    }
    
}
