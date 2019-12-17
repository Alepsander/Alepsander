import java.util.Scanner;

/*
Realizar un diagrama de flujo de un programa que, dados dos números,
imprima por pantalla la potencia de uno elevado al otro. Realizar el programa
mediante la utilización de bucles y no mediante el operador ^.
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// Definicion de variables
		int base = 0;
		int exponente = 0;
		boolean valorCorrecto = false;

		double potencia = 1;

		// Definición de objeto de tipo Scanner para la captura de entrada por teclado
		Scanner sc = new Scanner(System.in);

		// Introducción de valores por el usuario

		while (!valorCorrecto)// Petición de la base
		{
			System.out.println("Indica un valor para la base ");
			if (sc.hasNextInt()) {
				base = sc.nextInt();// Tomamos el valor del buffer
				valorCorrecto = true;

			} else {
				sc.next();// Liberamos el valor incorrecto del buffer
				valorCorrecto = false;
			}
		} // while peticion base

		// Petición del exponente

		valorCorrecto=false;//Reseteamos a false para que entre por el bucle de exponente al menos una vez
		
		while (!valorCorrecto) {
			System.out.println("Indica un valor para el exponente ");
			if (sc.hasNextInt()) {
				exponente = sc.nextInt();// Tomamos el valor del buffer
				valorCorrecto = true;

			} else {
				sc.next();// Liberamos el valor incorrecto del buffer
				valorCorrecto = false;
			}
		}

		sc.close();
		
		// cálculo de la potencia
		if(exponente==0)
			potencia=1;
		else
		{
			
			if(exponente<0)//Potencias negativas
			{
				int exponentePositivo=-exponente;//Cambiamos el signo del exponente
				
				for(int i=0;i<exponentePositivo;i++)
				{
					potencia=potencia*base;
				}
				potencia=(double)1/potencia;
				
			}
			else//Potencias positivas
			{
				for(int i=0;i<exponente;i++)
				{
					potencia=potencia*base;
				}
			}
		}
		// impresión de resultados
		System.out.printf("El resultado de %d elevado a %d es %f",base,exponente,potencia);
	}// main

}// class