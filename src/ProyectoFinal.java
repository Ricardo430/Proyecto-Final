/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        pokemonElectrico pikachu = new pokemonElectrico("Pikachu", 60, 0.4, 5, 100, "Eléctrico", 25);
        pokemonFuego charmander = new pokemonFuego("Charmander", 8.5, 0.6, 5, 100, "Fuego", 4);
        Entrenador entrenador = new Entrenador ("Maestro", 10, "Ricardo", 23, "Masculino");

        System.out.println("Se ha agregado un nuevo entrenador: "+entrenador.nombre+" "+entrenador.edad+" años "+entrenador.genero);
        // Agregar Pokemon a la Pokedex
        miPokedex.agregarPokemon(pikachu);
        miPokedex.agregarPokemon(charmander);

        // Listar Pokemon
        miPokedex.listarPokemones();

        // Mostrar detalles de un Pokémon específico
        miPokedex.mostrarDetalles(4);
    
    }
    
}
    
