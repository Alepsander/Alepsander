import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		double a�o=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un a�o");
		
		if(sc.hasNextDouble()){
			
				a�o = sc.nextDouble();
		}
		
		if(a�o>0) {
		 if((a�o%4==0) && (a�o%100!=0 || (a�o%100==0 && a�o%400==0)))
			 System.out.println( a�o + "es bisiesto");
		
		else
			System.out.println( a�o + "no es bisiesto");
		}
}
}