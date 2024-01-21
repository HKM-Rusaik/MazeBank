module com.example.mazebank{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires de.jensd.fx.glyphs.fontawesome;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.mazebank to javafx.fxml;
    exports com.example.mazebank;
    exports com.example.mazebank.Controllers;
    exports com.example.mazebank.Controllers.admin;
    exports com.example.mazebank.Controllers.client;
    exports com.example.mazebank.Models;
    exports com.example.mazebank.views;
}