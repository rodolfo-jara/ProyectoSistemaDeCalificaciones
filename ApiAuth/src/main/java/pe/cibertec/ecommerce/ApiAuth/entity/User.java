
package pe.cibertec.ecommerce.ApiAuth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;



@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userName;
    private String email;
    private String password;
    @ManyToMany
    @JoinTable(name = "User_Roles", 
            joinColumns = 
                    @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = 
                    @JoinColumn(name = "role_id", referencedColumnName = "id"))
   
    private Set<Role> roles;
}
