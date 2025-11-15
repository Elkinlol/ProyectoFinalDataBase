package co.bases.datos.proyectofinaldatabase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        stage.setTitle("ELECTROCOLOMBIANO -Inicio de Sesión-");
        stage.setScene(scene);
        stage.show();
    }
}
