import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		int num=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica cuantos números se introducirán");
		
			sc.hasNextInt();
		
			num=sc.nextInt();
		
		int sumaPares=0;
		int productoImpares=1;
		
		while (num>0) {
		
		if (num>0) {
			System.out.println("Introduce un número");
			
			sc.hasNextInt();
			int num2 = sc.nextInt();
			
			if (num2%2==0) {
				sumaPares=sumaPares+num;
			}
				else
					productoImpares=productoImpares+num;
		}
			num=num-1;	
		
		}
		
		System.out.println("El producto impares es" + productoImpares + "la suma de los pares es" + sumaPares);

}
}

