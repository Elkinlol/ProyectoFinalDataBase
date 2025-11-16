package co.bases.datos.proyectofinaldatabase.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder(toBuilder = true)

public class LoginDTO {

    private String email;
    private String password;

    public LoginDTO (String email, String password){
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("El correo electronico es obligatorio");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("La contraseña es obligatoria");
    }
}