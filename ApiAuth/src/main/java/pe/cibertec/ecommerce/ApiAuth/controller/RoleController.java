
package pe.cibertec.ecommerce.ApiAuth.controller;

import java.util.List;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;
import pe.cibertec.ecommerce.ApiAuth.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
    
    @Autowired
    private RoleService roleService;
    @GetMapping("/findAll")
    public ResponseEntity<List<Role>> findAll(){
        return new ResponseEntity<>(roleService.findAll(),
                HttpStatus.OK) ;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Role> add(@RequestBody Role role){
        return new ResponseEntity<>(roleService.add(role),
        HttpStatus.CREATED);
    }
}
