package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    //atributos
    private String tipo;
    private String nombre;
    private Integer cantidad;

    public  Producto(){

    }

    //constructor
    public Producto(String tipo, String nombre, Integer cantidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return  "Tipo='" + tipo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Cantidad=" + cantidad +"\n";
    }


}
