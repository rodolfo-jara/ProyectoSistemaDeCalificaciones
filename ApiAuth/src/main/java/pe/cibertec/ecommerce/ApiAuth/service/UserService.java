package pe.cibertec.ecommerce.ApiAuth.service;


import java.util.Optional;
import pe.cibertec.ecommerce.ApiAuth.entity.User;
public interface UserService {
    User findByEmail(String email);
    User findByUserName(String userName);
    Optional<User> findByUserNameOrEmail(String userName,String email);
    Boolean existsByEmail(String email);
    Boolean existsByUserName(String userName); 
    User add(User user);
    
}
