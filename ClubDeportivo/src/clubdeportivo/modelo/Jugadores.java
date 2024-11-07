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
    String Fechanacimiento;
    int NumeroGoles;
    int Plusporgol;

    public Jugadores(String nombre, String DNI, String direccion, int Telefono, int Sueldo,String posicion,int Plusporgol,int NumeroGoles,String Fechanacimiento) {
        super(nombre, DNI, direccion, Telefono, Sueldo);
        this.posicion=posicion;
        this.Plusporgol=Plusporgol;
        this.NumeroGoles=NumeroGoles;
        this.Fechanacimiento=Fechanacimiento;
    }
    
 

    @Override
    public String toString() {
        return "Jugadores:"+ super.toString() + "posicion=" + posicion + ", Fechanacimiento=" + Fechanacimiento + ", NumeroGoles=" + NumeroGoles + ", Plusporgol=" + Plusporgol + '}';
    }
    
    

    
}
