import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		
		double num1=0;
		double num2=0;
		double resultado=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		if(sc.hasNextDouble()){
		
			num1 = sc.nextDouble();
		}
		else
		{
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		
		System.out.println("Introduce otro número");
		
		if(sc.hasNextDouble()){
		
		
			num2 = sc.nextDouble();
		}
		else
		{
			System.out.println("El número introducido no es correcto");
		}
			
		resultado=num1+num2;
		
		resultado=num1-num2;
		
		
		System.out.println("El resultado es"+ resultado);
		
	}
}