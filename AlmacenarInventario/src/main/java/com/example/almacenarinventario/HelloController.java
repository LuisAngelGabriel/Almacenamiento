package com.example.almacenarinventario;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {

    // FXML Annotations
    @FXML
    private Button bAlmacenar;

    @FXML
    private Button bLimpiar;

    @FXML
    private ComboBox<String> cTipoActivo;

    @FXML
    private TextField tID;

    @FXML
    private TextField tMarca;

    @FXML
    private TextField tModelo;

    @FXML
    private TextField tResponsable;

    @FXML
    private TextField tSerial;

    @FXML
    public void limpiarCampos() {
        tID.clear();
        tMarca.clear();
        tModelo.clear();
        tResponsable.clear();
        tSerial.clear();
        cTipoActivo.getSelectionModel().clearSelection();
    }

    @FXML
    public void almacenarDatos() {

        String id = tID.getText();
        String tipoActivo = cTipoActivo.getValue();
        String marca = tMarca.getText();
        String modelo = tModelo.getText();
        String serial = tSerial.getText();
        String responsable = tResponsable.getText();

        Almacenar.almacenarDatos(id, tipoActivo, marca, modelo, serial, responsable);

        limpiarCampos();
    }

    @FXML
    public void initialize() {
        cTipoActivo.getItems().addAll("Desktop", "Laptop", "Impresora", "Scanner", "Switch", "Router", "Firewall");
    }
}
