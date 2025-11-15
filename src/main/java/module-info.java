module co.bases.datos.proyectofinaldatabase {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires javafx.graphics;
    requires javafx.base;
    requires java.sql;

    opens co.bases.datos.proyectofinaldatabase to javafx.fxml;
    exports co.bases.datos.proyectofinaldatabase;

    opens co.bases.datos.proyectofinaldatabase.controllers  to javafx.fxml;
    exports co.bases.datos.proyectofinaldatabase.controllers;
}