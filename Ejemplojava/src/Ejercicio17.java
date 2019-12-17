import java.util.Scanner;


public class Ejercicio17 {

	public static void main(String[] args) {
		double notasIntroducidas=0;
		double sumaNotas=0;
		double nota=0;
		
		Scanner sc = new Scanner(System.in);
		while (nota==0) {
			while (nota==0) {
		System.out.println("Indica unas notas para calcular la media hasta introducir un 0");
		
		if(sc.hasNextDouble()){
			
			sumaNotas = sc.nextDouble();
			}
		if (nota<0) {
			System.out.println("Las notas deben ser positivas");
		}
		
			else 
				if (nota==0) {
				System.out.println("La media es" + sumaNotas/notasIntroducidas);
				}
				
				else 
					notasIntroducidas=notasIntroducidas + 1;
					sumaNotas=sumaNotas+nota;
		}
		}
	}
}