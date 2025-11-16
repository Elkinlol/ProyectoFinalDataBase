package co.bases.datos.proyectofinaldatabase.dtos;

import co.bases.datos.proyectofinaldatabase.model.UserRole;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder(toBuilder = true)

public class UserDTO{

    public String cedula;
    public String fullName;
    public int age;
    public String email;
    public String password;
    public UserRole role;

    public UserDTO (String cedula, String fullName, int age, String email, String password, UserRole role) {
        this.cedula = cedula;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.role = role;

        validate();
    }

    public void validate (){

        if (email == null || email.isBlank())
            throw new IllegalArgumentException("El email es obligatorio");

        if (cedula == null || cedula.isBlank())
            throw new IllegalArgumentException("El cedula es obligatoria");

        if (role == null)
            throw new IllegalArgumentException("El role es obligatoria");

        if (fullName == null || fullName.isBlank())
            throw new IllegalArgumentException("El fullname es obligatoria");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("El password es obligatoria");
    }

}
