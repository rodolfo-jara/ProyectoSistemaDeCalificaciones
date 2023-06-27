
package pe.cibertec.ecommerce.ApiAuth.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.dao.UserRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findByUserName(String userName) {
       return userRepository.findByUserName(userName);
    }

    @Override
    public Optional<User> findByUserNameOrEmail(String userName, String email) {
       return userRepository.findByUserNameOrEmail(userName, email);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public Boolean existsByUserName(String userName) {
        return userRepository.existsByUserName(userName);
     }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    
}
