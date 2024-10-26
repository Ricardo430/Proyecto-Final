
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public class Pokemon{
    protected String nombre;
    protected double peso;
    protected double altura;
    protected int nivel;
    protected int vida;
    protected String tipo;
    protected int numeroPokedex;
    protected int ataque;
    boolean estado;

    public Pokemon(String nombre, double peso, double altura, int nivel, int vida, String tipo, int numeroPokedex, int ataque) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
        this.numeroPokedex = numeroPokedex;
        this.ataque = ataque;
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

    public int getAtaque() {
        return ataque;
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

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0; // No puede tener vida negativa
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
    
    @Override
    public String toString() {
        return nombre + " (Vida: " + vida + ", Ataque: " + ataque + ")";
    }
    
    public void mostrarDetalles() {
        System.out.println("Número Pokedex: " + numeroPokedex);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
    }
    
    public boolean batalla(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Crear una lista de Pokémon
        Pokemon[] pokemones = {
            new Pokemon("Bulvasaur", 6.9, 0.7, 1, 100, "Planta", 1, 20),
            new Pokemon("Charmander", 8.5, 0.6, 1, 100, "Fuego", 4, 25),
            new Pokemon("Squirtle", 9.0, 0.5, 1, 100, "Agua",7, 18),
            new Pokemon("Pikachu", 6.0, 0.4, 5, 100, "Eléctrico", 25, 20)
        };  
        
        // Mostrar la lista de Pokemon
        System.out.println("Elige tu Pokemon:");
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i + 1) + ". " + pokemones[i]);
        }
        
        // Elegir Pokémon del usuario
        System.out.print("Ingresa el numero de tu Pokemon: ");
        int eleccionUsuario = scanner.nextInt() - 1;
        Pokemon pokemonUsuario = pokemones[eleccionUsuario];
        
        // Elegir Pokémon de la máquina
        Pokemon pokemonRival = pokemones[random.nextInt(pokemones.length)];
        
        // Batalla
        System.out.println("\n La batalla comienza!");
        System.out.println("Tu Pokemon: " + pokemonUsuario);
        System.out.println("Pokemon de el rival: " + pokemonRival+"\n");
        
        while (pokemonUsuario.estaVivo() && pokemonRival.estaVivo()) {
            // El usuario ataca
            pokemonRival.recibirDaño(pokemonUsuario.getAtaque());
            System.out.println(pokemonUsuario.getNombre() + " ataca a " + pokemonRival.getNombre() + " causando " + pokemonUsuario.getAtaque() + " de daño.");
            System.out.println(pokemonRival.getNombre() + " tiene " + pokemonRival.getVida() + " de vida restante.");

            if (!pokemonRival.estaVivo()) {
                System.out.println(pokemonRival.getNombre() + " ha sido derrotado. Ganaste!!");
                estado = true;
                break;
            }
            // El rival ataca
            pokemonUsuario.recibirDaño(pokemonRival.getAtaque());
            System.out.println(pokemonRival.getNombre() + " ataca a " + pokemonUsuario.getNombre() + " causando " + pokemonRival.getAtaque() + " de daño.");
            System.out.println(pokemonUsuario.getNombre() + " tiene " + pokemonUsuario.getVida() + " de vida restante.");

            if (!pokemonUsuario.estaVivo()) {
                System.out.println(pokemonUsuario.getNombre() + " ha sido derrotado. Perdiste!!");
                estado = false;
            }
        }
        scanner.close();
        return estado;
    }
}
