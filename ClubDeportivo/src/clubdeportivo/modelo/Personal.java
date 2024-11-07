/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo.modelo;

/**
 *
 * @author Manana
 */
public class Personal {

    String nombre;
    String DNI;
    String direccion;
    int Telefono;
    int Sueldo;

    public Personal(String nombre, String DNI, String direccion, int Telefono, int Sueldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", Telefono=" + Telefono + ", Sueldo=" + Sueldo+" ";
    }
    

 


    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }



}
