import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		
		double num=0;
		double resultado=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce la velocidad");
		
		if(sc.hasNextDouble()){
			
			num = sc.nextDouble();
		
		resultado=num*1000/3600;
		
		System.out.println("La velocidad en m/s es"+ resultado);
		}
	}
}
	
