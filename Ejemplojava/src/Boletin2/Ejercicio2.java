package Boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double nombre=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime un nombre");
		
		if(sc.hasNextDouble()){
			
			nombre = sc.nextDouble();
		}
		
		System.out.println("El nombre introducido es" + nombre);

		sc.close();
}
}