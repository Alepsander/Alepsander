package Boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		double num3=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce tres n�meros");
		
		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		if (sc.hasNextDouble()) {

			num2 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		if (sc.hasNextDouble()) {

			num3 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		
		if (num1+num2==num3) {
			System.out.println("La suma de los dos primeros n�meros equivalen al tercero");
		} else {
			System.out.println("El tercer n�mero no es la suma de los dos primeros");
		}
		sc.close();
}
}