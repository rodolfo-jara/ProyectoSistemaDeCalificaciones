
package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.dao.RoleRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role add(Role role) {
        return roleRepository.save(role);
    }
    
}
