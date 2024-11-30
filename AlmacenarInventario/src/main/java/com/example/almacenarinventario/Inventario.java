package com.example.almacenarinventario;

public class Inventario {
    private String id;
    private String marca;
    private String modelo;
    private String serial;
    private String responsable;

    public Inventario(String id, String marca, String modelo, String serial, String responsable) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.responsable = responsable;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSerial() {
        return serial;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
