import java.util.Scanner;

public class Ejercicio9 {
	
public static void main(String[] args) {
		
		double num1=1;
		double num2=1;
		
		Scanner sc = new Scanner(System.in);
		
		{
			while (num1%2!=0)
			{
				System.out.println("Introduce un número par");
				if  (sc.hasNextDouble()) {
		
					num1 = sc.nextDouble();
				} else {
					System.out.println("El valor introducido no es correcto");
					sc.next();
		
				}
			
			{
				while (num1%2!=0)
				{
					System.out.println("Introduce otro número par");
					if  (sc.hasNextDouble()) {
			
						num1 = sc.nextDouble();
					} else {
						System.out.println("El valor introducido no es correcto");
						sc.next();

			}
			if (num2%2==0);
				System.out.println("El cociente es" + (num1 / num2));
		
}
}
}
}
}
}
