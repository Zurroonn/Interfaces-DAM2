/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo.modelo;

/**
 *
 * @author Manana
 */
public class Jugadores extends Personal{
    String posicion;
    int Fechanacimiento;
    boolean Partidoganado;
    int NumeroGoles;
    int Plusporgol;

    public Jugadores(String nombre, String DNI, String direccion, int Telefono, int Sueldo) {
        super(nombre, DNI, direccion, Telefono, Sueldo);
    }
    
 

    @Override
    public String toString() {
        return "Jugadores{" + "posicion=" + posicion + ", Fechanacimiento=" + Fechanacimiento + ", Partidoganado=" + Partidoganado + ", NumeroGoles=" + NumeroGoles + ", Plusporgol=" + Plusporgol + '}';
    }
    
    

    
}
