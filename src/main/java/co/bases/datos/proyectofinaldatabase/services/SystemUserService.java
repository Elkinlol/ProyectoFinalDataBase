package co.bases.datos.proyectofinaldatabase.services;

import co.bases.datos.proyectofinaldatabase.dao.UserDAO;
import co.bases.datos.proyectofinaldatabase.dtos.LoginDTO;
import co.bases.datos.proyectofinaldatabase.dtos.RegisterDTO;
import co.bases.datos.proyectofinaldatabase.dtos.UserDTO;
import co.bases.datos.proyectofinaldatabase.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder

public class SystemUserService {

    protected UserDAO userDAO;

    public UserDTO login(LoginDTO loginDTO) throws Exception {
    /*
        if (loginDTO.userName() == null || loginDTO.userName().isEmpty()) {
            throw new Exception("El usuario no puede estar vacio");
        }
        if (loginDTO.password() == null || loginDTO.password().isBlank()) {
            throw new Exception("El usuario no puede estar vacio");
        }

        UserDTO user = userDAO.findByUserName(loginDTO.userName());
        if (user == null) {
            throw new Exception("El usuario no existe");
        }
        if (!user.getPassword().equals(loginDTO.password())) {
        }
        return new UserDTO(
                user.getCedula(),
                user.getUserName(),
                user.getFullName(),
                user.getRole()
        );*/
        //Modificar al finalizar la implementacion de la BD
        UserRole role = UserRole.CUSTOMER;
        return new UserDTO("","",0,"","",role);
    }

    public UserDTO register(RegisterDTO dto) throws Exception {
        UserDTO userExistente = userDAO.findByEmail(dto.getEmail());
        if (userExistente != null) {
            throw new Exception("El nombre de usuario ya existe");
        }
        UserDTO nuevo = UserDTO.builder()
                .cedula(dto.getCedula())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .fullName(dto.getFullName())
                .role(dto.getRole())
                .build();

        return nuevo;
    }
}
