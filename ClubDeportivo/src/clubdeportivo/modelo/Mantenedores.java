/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo.modelo;

/**
 *
 * @author Manana
 */
public class Mantenedores extends Personal{
    boolean Fijo;

    public Mantenedores(String nombre, String DNI, String direccion, int Telefono, int Sueldo) {
        super(nombre, DNI, direccion, Telefono, Sueldo);
    }


    @Override
    public String toString() {
        return "Mantenedores{" + "Fijo=" + Fijo + '}';
    }
    
}
