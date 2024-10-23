/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public class Entrenador extends Persona{
    private String tipo;
    private int rango;

    public Entrenador(String tipo, int rango, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.tipo = tipo;
        this.rango = rango;
    }

    public Entrenador() {
    }

    public String getTipo() {
        return tipo;
    }

    public int getRango() {
        return rango;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
