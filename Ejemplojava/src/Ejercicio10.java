import java.util.Scanner;

public class Ejercicio10 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		double num1=0;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		{
			if (sc.hasNextDouble()) {

				num1 = sc.nextDouble();
				
			if (num1>=0)
				System.out.println("El n�mero es positivo");
				
				else 
					System.out.println("El n�mero es negativo");
		
	}
	
}
}
}