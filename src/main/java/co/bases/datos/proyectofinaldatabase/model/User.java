package co.bases.datos.proyectofinaldatabase.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private String cedula;
    private int age;
    private String password;
    private String email;
    private String fullName;
    private UserRole role;

}
