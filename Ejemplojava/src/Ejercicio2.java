import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		double base=0;
		double altura=0;
		double resultado=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la base");
		
		if(sc.hasNextDouble())
		{
			base = sc.nextDouble();
		}
		else
		{
			System.out.println("Introduzca el valor de la altura");
		
		if(sc.hasNextDouble())
		{
			altura = sc.nextDouble();
		}
		else
		{
			System.out.println("No has introducido un valor válido para la altura");
		}
		
		resultado=base*altura/2;
		
		System.out.println("El area del triángulo es" + resultado);
		}
	}
}
