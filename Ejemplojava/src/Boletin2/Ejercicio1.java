package Boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		double resultado=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
	if(sc.hasNextDouble()){
		
		num1 = sc.nextDouble();
	}
	else
	{
		System.out.println("El valor introducido no es correcto");
		sc.next();
	}
	
	System.out.println("Introduce otro n�mero");
	
	if(sc.hasNextDouble()){
	
	
		num2 = sc.nextDouble();
	}
	else
	{
		System.out.println("El n�mero introducido no es correcto");
	}

		resultado=num1+num2;
		System.out.println("El resultado de la suma es" + resultado);
		
		resultado=num1-num2;
		System.out.println("El resultado de la resta es" + resultado);

		resultado=num1*num2;
		System.out.println("El resultado de la multiplicacion es" + resultado);

		resultado=num1/num2;
		System.out.println("El resultado de la division es" + resultado);

		sc.close();
	
}
}