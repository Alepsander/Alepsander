import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		int num=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica cuantos n�meros se introducir�n");
		
			sc.hasNextInt();
		
			num=sc.nextInt();
		
		int valorMaximo=0;

		
		while (num>0) {
		
		if (num>0) {
			System.out.println("Introduce un n�mero");
			
			sc.hasNextInt();
			int num2 = sc.nextInt();
			
			if (num2 > valorMaximo) {
				valorMaximo=num2;
			}
				else
				
			num=num-1;	
		
		}
		}
		
		System.out.println("El valor m�ximo es" + valorMaximo);


}
}

