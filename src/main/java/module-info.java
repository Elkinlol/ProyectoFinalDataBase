module co.bases.datos.proyectofinaldatabase {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;


    opens co.bases.datos.proyectofinaldatabase to javafx.fxml;
    exports co.bases.datos.proyectofinaldatabase;
}