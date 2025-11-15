package co.bases.datos.proyectofinaldatabase.services;

import co.bases.datos.proyectofinaldatabase.dao.UserDAO;
import co.bases.datos.proyectofinaldatabase.dtos.LoginDTO;
import co.bases.datos.proyectofinaldatabase.dtos.RegisterDTO;
import co.bases.datos.proyectofinaldatabase.dtos.UserDTO;
import co.bases.datos.proyectofinaldatabase.model.Role;
import co.bases.datos.proyectofinaldatabase.model.SystemUser;
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
        Role role = new Role("User", 2);
        return new UserDTO("","","",role);
    }

    public UserDTO register(RegisterDTO dto) throws Exception {
        UserDTO userExistente = userDAO.findByUserName(dto.userName());
        if (userExistente != null) {
            throw new Exception("El nombre de usuario ya existe");
        }
        SystemUser nuevo = SystemUser.builder()
                .cedula(dto.cedula())
                .userName(dto.userName())
                .password(dto.password())
                .fullName(dto.fullName())
                .role(dto.role())
                .build();
        return new UserDTO(nuevo.getCedula(), nuevo.getUserName(), nuevo.getFullName()
                , nuevo.getRole());
    }
}
