/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
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

    public String getNombres() {
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
    
    public void ingresarUsuario(){
        nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre de usuario!");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu edad"));
        genero = JOptionPane.showInputDialog(null,"Ingresa tu genero");
        JOptionPane.showMessageDialog(null, "Bienvenido "+nombre+"!!!");
        JOptionPane.showMessageDialog(null, "Te convertiras en el mejor Maestro Pokemon, te lo aseguro!!!");
        tipo = "Entrenador Pokemon";
        rango = 1;
        JOptionPane.showMessageDialog(null, "Por el momento eres un "+tipo+" rango "+rango);
        JOptionPane.showMessageDialog(null, "Vive esta aventura y conviertete en el mejor Maestro Pokemon");
        JOptionPane.showMessageDialog(null, "Adelante!!");
    }
}
