package Boletin2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double dividendo=3245;
		double divisor=25;
		double resto;
		resto=dividendo%divisor;
		while (resto!=0) {
			resto=dividendo%divisor;
			if(resto!=0) {
				dividendo=divisor;
				divisor=resto;
			}
		}
		System.out.println("El divisor es " + divisor);
		sc.close();
}
}
