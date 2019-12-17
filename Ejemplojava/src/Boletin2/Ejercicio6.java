package Boletin2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double num1=0;
		double num2=1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un número");
		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
			}
		while (num2<num1) {
			System.out.println(num2);
			num2=num2+1;
		}
		sc.close();
}
}