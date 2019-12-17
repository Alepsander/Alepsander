import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");

		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		System.out.println("Introduce un segundo número");

		if (sc.hasNextDouble()) {

			num2 = sc.nextDouble();
		} else {
			System.out.println("El número introducido no es correcto");
		}
		System.out.println("Introduce un tercer número");
		
		if (sc.hasNextDouble()) {
			
			num3 = sc.nextDouble();
			}
		{
		if (num1==num2)
			System.out.println("Los números deben ser distintos");
		
		if (num2==num3)
			System.out.println("Los números deben ser distintos");
		
		if (num3==num1)
			System.out.println("Los números deben ser distintos");
		
		else
			if (num1>num2 && num2>num3)
				System.out.println(num1+">"+num2+">"+num3);
			else
				if (num1>num2 && num1>num3)
					System.out.println(num1+">"+num3+">"+num2);
					else 
						if (num2>num1 && num1>num3)
							System.out.println(num2+">"+num1+">"+num3);
						else 
							if (num2>num1 && num2>num3)
								System.out.println(num2+">"+num3+">"+num1);
							else 
								if (num3>num1 && num1>num2)
								System.out.println(num3+">"+num1+">"+num2);
								else
									System.out.println(num3+">"+num2+">"+num1);
		
			
		
		}
}
}
