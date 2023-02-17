
package com.mycompany.concesionaria.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luis Zenteno
 */

@Entity
public class Automovil implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    private String motor;
    private int cantPuertas;
    private int anioFabricacion;

    public Automovil() {
    }

    public Automovil(int id, String marca, String modelo, String patente, String color, String motor, int cantPuertas, int anioFabricacion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.motor = motor;
        this.cantPuertas = cantPuertas;
        this.anioFabricacion = anioFabricacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    
}
