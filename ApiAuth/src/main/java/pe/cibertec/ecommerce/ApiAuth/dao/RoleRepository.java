
package pe.cibertec.ecommerce.ApiAuth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
    
}
