/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Pokedex miPokedex = new Pokedex();
        boolean estado = false;

        // Crear algunos Pokemon
        pokemonPlanta bulbasaur = new pokemonPlanta("Bulvasaur", 6.9, 0.7, 1, 100, "Planta", 1, 20);
        pokemonFuego charmander = new pokemonFuego("Charmander", 8.5, 0.6, 1, 100, "Fuego", 4, 25);
        pokemonAgua squirtle = new pokemonAgua("Squirtle", 9.0, 0.5, 1, 100, "Agua",7, 18);
        pokemonElectrico pikachu = new pokemonElectrico("Pikachu", 6.0, 0.4, 5, 100, "Eléctrico", 25, 20);
        
        System.out.println("Bienvenido!!!");
        
        Entrenador entrenador = new Entrenador();
        Pokemon pokemon = new Pokemon();
        
        // Agregar Pokemon a la Pokedex
        miPokedex.agregarPokemon(bulbasaur);
        miPokedex.agregarPokemon(squirtle);
        miPokedex.agregarPokemon(charmander);
        miPokedex.agregarPokemon(pikachu);
        
        //Ingreso de usuario
        entrenador.ingresarUsuario();
        
        //Inicia la batalla
        estado = pokemon.batalla();
        
        if(estado == true){
            JOptionPane.showMessageDialog(null, "Subes de rango!!");
            entrenador.setRango(entrenador.getRango()+1);
            entrenador.setTipo("Lider de Gimnasio");
            JOptionPane.showMessageDialog(null, "Rango nuevo: "+entrenador.getRango()+" Tipo: "+entrenador.getTipo());
            JOptionPane.showMessageDialog(null, "A al siguiente batalla!!");
            
            //Siguiente batalla
            estado = pokemon.batalla();
                if(estado == true){
                    JOptionPane.showMessageDialog(null, "Subes de rango!!");
                    entrenador.setRango(entrenador.getRango()+1);
                    entrenador.setTipo("Maestro Pokemon");
                    JOptionPane.showMessageDialog(null, "Rango nuevo: "+entrenador.getRango()+" Tipo: "+entrenador.getTipo());
                    JOptionPane.showMessageDialog(null, "Felicidades "+entrenador.nombre+" te convertiste en un Maestro pokemon!!");
                }else{
                    JOptionPane.showMessageDialog(null, "Intenta de nuevo");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Intenta de nuevo");
        }
        
        // Listar Pokemon
        miPokedex.listarPokemones();
//
//        // Mostrar detalles de un Pokémon específico
        miPokedex.mostrarDetalles(4);
    }
}
    
