/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack_base;

import java.util.Scanner;

public class Dinero {
private  int saldo;
private  int apuestasrealizadas;
private static Scanner sc= new Scanner (System.in);
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}
public int getApuestasrealizadas() {
	return apuestasrealizadas;
}
public void setApuestasrealizadas(int apuestasrealizadas) {
	this.apuestasrealizadas = apuestasrealizadas;
}
public Dinero(int saldo, int apuestasrealizadas) {
	super();
	this.saldo = saldo;
	this.apuestasrealizadas = apuestasrealizadas;
}
public static int agregarfondos() {
	System.out.println("Elige la cantidad de fondos a añadir");
	
	int dinero=sc.nextInt();
	return dinero;
}
public static int retirarfondos(int dinero) {
	if (dinero<0) {
		System.out.println("No hay dinero para retirar");
	return dinero;
	}
	System.out.println("Elige la cantidad de fondos a retirar");
	int retirar=sc.nextInt();
	if(dinero-retirar<0) {
		System.out.println("No tienes tantos fondos para retirar");
		return dinero;
	}
	return dinero-retirar;
}
public void comprobarsaldo() {
	System.out.println("Tu saldo es: "+saldo);
}
public void apuestas(){
	System.out.println("Llevas "+apuestasrealizadas+" realizadas ");
}
}
