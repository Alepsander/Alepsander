import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 1;
		int num2 = 0;

		while (num > 0) {
			System.out.println("Indica un numero");
			num = sc.nextInt();
			
			if(num<=0)
			{
				sc.hasNextInt();
				num=sc.nextInt();
				}
		
			int Cuadrado = num * num;
			System.out.println("El cuadrado de" + num + "es" + Cuadrado); 

			// while (num2>0)
			System.out.println("Introduce 1 para seguir calculando cuadrados, introduce 0 para salir");
			num2 = sc.nextInt(); 

			if (1 == 1) {
				num2 = 1;
				// num;
			} else {
				num2 = 0;
				sc.close();
			}
		
}
	}
}

