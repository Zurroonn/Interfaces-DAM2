/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo.modelo;

/**
 *
 * @author Manana
 */
public class Directivo extends Personal{
    String cargo;
    
    String activo;

    public Directivo(String nombre, String DNI, String direccion, int Telefono, int Sueldo,String cargo,String activo) {
        super(nombre, DNI, direccion, Telefono, Sueldo);
        this.cargo=cargo;
        this.activo=activo;
    }



    @Override
    public String toString() {
        return "Directivo:" + super.toString() + "cargo=" + cargo + ", activo=" + activo ;
    }

    
}
