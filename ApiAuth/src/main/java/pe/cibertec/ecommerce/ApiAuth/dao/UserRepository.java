package pe.cibertec.ecommerce.ApiAuth.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    User findByUserName(String userName);
    Optional<User> findByUserNameOrEmail(String userName,String email);
    Boolean existsByEmail(String email);
    Boolean existsByUserName(String userName); 
    
}
