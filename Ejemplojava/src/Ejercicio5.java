import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero");

		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
		} else {
			System.out.println("El valor introducido no es correcto");
			sc.next();
		}
		System.out.println("Introduce otro n�mero");

		if (sc.hasNextDouble()) {

			num2 = sc.nextDouble();
		} else {
			System.out.println("El n�mero introducido no es correcto");
		}

			if (num1==num2) {
				System.out.println("Los dos n�meros son iguales");
			} else {

				if (num1 > num2) {

					System.out.println("El primer n�mero es mayor");
				} else {
					System.out.println("El segundo n�mero es mayor");
				}
			}
		}
	}
