
package pe.cibertec.ecommerce.ApiAuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiAuth.dto.SignUpDto;
import pe.cibertec.ecommerce.ApiAuth.entity.User;
import pe.cibertec.ecommerce.ApiAuth.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto user){
        User userEntity = new User();
        userEntity.setName(user.getName());
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(passwordEncoder.encode(user.getPassword()));
        userEntity.setRoles(user.getRoles());
        
        var result = userService.add(userEntity);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
                
        
    }
    
    
    @GetMapping("/hello")
    public ResponseEntity<String> Grettings(){
        return new ResponseEntity<>("Hello World!",HttpStatus.OK);
    }
    
}
