package Boletin2;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		double radio=0;
		double pi=3.1416;
		double resultado=0;
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Dime el valor del radio");
		
		if(sc.hasNextDouble()) {
			
			radio= sc.nextDouble();
			
		resultado=(radio*radio)*pi;
		
		System.out.println("El área del circulo es" + resultado);
		
		sc.close();
			
			
		}
			
	}

}
