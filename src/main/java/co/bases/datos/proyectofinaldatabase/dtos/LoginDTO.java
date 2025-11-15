package co.bases.datos.proyectofinaldatabase.dtos;

public record LoginDTO(String userName, String password) {

    public LoginDTO {
        if (userName == null || userName.isBlank())
            throw new IllegalArgumentException("El usuario es obligatorio");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("La contraseña es obligatoria");
    }
}