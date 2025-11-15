package co.bases.datos.proyectofinaldatabase.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.bases.datos.proyectofinaldatabase.dtos.LoginDTO;
import co.bases.datos.proyectofinaldatabase.services.SystemUserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lombok.Builder;

@Builder
public class LoginController{

    private SystemUserService systemUserService;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label forgot_password;

    @FXML
    private Button login_btn;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_username;

    @FXML
    void forgot_password_btn(MouseEvent event) {

    }

    @FXML
    void login_btn(ActionEvent event) throws Exception {
        LoginDTO loginDTO= new LoginDTO(txt_username.getText(), txt_password.getText());
        systemUserService.login(loginDTO);

    }

    @FXML
    void initialize() {
        assert forgot_password != null : "fx:id=\"forgot_password\" was not injected: check your FXML file 'login.fxml'.";
        assert login_btn != null : "fx:id=\"login_btn\" was not injected: check your FXML file 'login.fxml'.";
        assert txt_password != null : "fx:id=\"txt_password\" was not injected: check your FXML file 'login.fxml'.";
        assert txt_username != null : "fx:id=\"txt_username\" was not injected: check your FXML file 'login.fxml'.";

    }

}
