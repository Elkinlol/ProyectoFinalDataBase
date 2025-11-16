package co.bases.datos.proyectofinaldatabase.dtos;
import co.bases.datos.proyectofinaldatabase.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class RegisterDTO{

    public String cedula;
    public String email;
    public String fullName;
    public UserRole role;
    public String password;


    public RegisterDTO (String email, String password, String cedula, UserRole role, String fullName) {

        if (email == null || email.isBlank())
            throw new IllegalArgumentException("El email es obligatorio");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("La contraseña es obligatoria");

        if (cedula == null || cedula.isBlank())
            throw new IllegalArgumentException("El cedula es obligatoria");

        if (role == null)
            throw new IllegalArgumentException("El role es obligatoria");

        if (fullName == null || fullName.isBlank())
            throw new IllegalArgumentException("El fullname es obligatoria");
    }
}
