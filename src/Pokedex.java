/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Pokedex {
    private ArrayList<Pokemon> pokemones;

    // Constructor
    public Pokedex() {
        this.pokemones = new ArrayList<>();
    }

    // Agregar un Pokémon a la Pokédex
    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
        System.out.println(pokemon.getNombre() + " ha sido agregado a la Pokedex.");
    }

    // Listar todos los Pokémon
    public void listarPokemones() {
        System.out.println("Pokémones en la Pokedex:");
        for (Pokemon pokemon : pokemones) {
            System.out.println("- " + pokemon.getNombre());
        }
    }

    // Mostrar detalles de un Pokémon por su número en la Pokedex
    public void mostrarDetalles(int numeroPokedex) {
        for (Pokemon pokemon : pokemones) {
            if (pokemon.getNumeroPokedex() == numeroPokedex) {
                pokemon.mostrarDetalles();
                return;
            }
        }
        System.out.println("No se encontró ningún Pokémon con el número de Pokedex " + numeroPokedex);
    }
}
