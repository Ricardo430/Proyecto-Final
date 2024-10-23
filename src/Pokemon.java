/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public abstract class Pokemon {
    protected String nombre;
    protected double peso;
    protected double altura;
    protected int nivel;
    protected int vida;
    protected String tipo;
    protected int numeroPokedex;

    public Pokemon(String nombre, double peso, double altura, int nivel, int vida, String tipo, int numeroPokedex) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
        this.numeroPokedex = numeroPokedex;
    }

    public Pokemon() {
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
    
    public abstract void evolucionar ();
    public void pelear (){
    };
    public abstract void atacar ();
    public abstract void descansar ();
    
    public void mostrarDetalles() {
        System.out.println("Número Pokedex: " + numeroPokedex);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
    }
}
