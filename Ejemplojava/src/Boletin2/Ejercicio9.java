package Boletin2;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double num=0;
		System.out.println("Introduce un número");
		if (sc.hasNextDouble()) {

			double num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		
		
}
}