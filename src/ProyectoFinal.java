/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author emili
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Pokedex miPokedex = new Pokedex();

        // Crear algunos Pokemon
        pokemonPlanta bulbasaur = new pokemonPlanta("Bulvasaur", 6.9, 0.7, 1, 100, "Planta", 1);
        pokemonFuego charmander = new pokemonFuego("Charmander", 8.5, 0.6, 1, 100, "Fuego", 4);
        pokemonAgua squirtle = new pokemonAgua("Squirtle", 9.0, 0.5, 1, 100, "Agua",7);
        pokemonElectrico pikachu = new pokemonElectrico("Pikachu", 6.0, 0.4, 5, 100, "Eléctrico", 25);
        
        System.out.println("Bienvenido!!!");
        
        Entrenador entrenador = new Entrenador();
        // Agregar Pokemon a la Pokedex
//        miPokedex.agregarPokemon(pikachu);
//        miPokedex.agregarPokemon(charmander);
        entrenador.ingresarUsuario();
        
        // Listar Pokemon
        miPokedex.listarPokemones();

        // Mostrar detalles de un Pokémon específico
        miPokedex.mostrarDetalles(4);
    
    }
    
}
    
