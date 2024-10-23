/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public class pokemonFuego extends Pokemon {

    public pokemonFuego(String nombre, double peso, double altura, int nivel, int vida, String tipo, int numeroPokedex) {
        super(nombre, peso, altura, nivel, vida, tipo, numeroPokedex);
    }

    public pokemonFuego() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }
    
    public void atacar (){}
    public void descansar (){}
    public void evolucionar (){}
    
    
}
