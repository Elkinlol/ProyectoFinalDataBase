module co.bases.datos.proyectofinaldatabase {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens co.bases.datos.proyectofinaldatabase to javafx.fxml;
    exports co.bases.datos.proyectofinaldatabase;
}