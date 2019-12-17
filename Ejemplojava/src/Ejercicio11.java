/*
Escribe un programa que muestre el cuadrado de los 100 primeros números 
naturales (utiliza un bucle while )

 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		//definicion de variables
		int num=1;
		
		while(num<=100)
		{
			System.out.printf("El cuadrado de %d es %d\n",num,num*num);
			num++;
		}

	}//main

}//class