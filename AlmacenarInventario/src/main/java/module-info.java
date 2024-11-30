module com.example.almacenarinventario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;

    opens com.example.almacenarinventario to javafx.fxml;

    exports com.example.almacenarinventario;
}
