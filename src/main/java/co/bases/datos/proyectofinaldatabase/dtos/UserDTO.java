package co.bases.datos.proyectofinaldatabase.dtos;

import co.bases.datos.proyectofinaldatabase.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder

public class UserDTO{

    public String cedula;
    public String fullName;
    public int age;
    public String email;
    public String password;
    public UserRole role;
}
