import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		double num=0;
		double iterador=0;
		double resultado=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(num<=0) {
		System.out.println("Indica un número");
		
		if(sc.hasNextDouble()){
			
			num = sc.nextDouble();
	}
		iterador = num;
		resultado = 1;
		
		if (num>=0){		
		
			while (num>=0) {
			if (iterador>0){
				resultado=resultado*iterador;
				iterador=iterador-1;
			}
				else
					System.out.println("El factorial de" + num + "es" + resultado);
			}
		}
		else 
				System.out.println("El número introducido debe ser 0");
	}
}
}		
			
			
		
		
		
	
	
	
