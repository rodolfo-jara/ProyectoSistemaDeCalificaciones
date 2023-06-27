package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;


public interface RoleService {
    List<Role> findAll();
    Role findByName(String name);
    Role add(Role role);
    
}
