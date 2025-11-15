package co.bases.datos.proyectofinaldatabase.dtos;

import co.bases.datos.proyectofinaldatabase.model.Role;

public record UserDTO(
        String cedula,
        String userName,
        String fullName,
        Role role
) {}
