import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double num1=0;
		double num2=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero par");
		
		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		System.out.println("Introduce un segundo n�mero");

		if (sc.hasNextDouble()) {

			num2 = sc.nextDouble();
		} else {
			
			System.out.println("El n�mero introducido no es correcto");
			
			if (num1>num2 && num1%num2==0) {
				System.out.println(num1 +"es m�ltiplo de" + num2);	
			}
			else {
				if (num2>=num1 && num2%num1==0) {
					System.out.println(num2 +"es m�ltiplo de" + num1);
				}
				else
					System.out.println(num1 + "y" + num2 + "no son multiplos");
			}
	}
	}
}
