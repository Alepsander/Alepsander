import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		double año=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un año");
		
		if(sc.hasNextDouble()){
			
				año = sc.nextDouble();
		}
		
		if(año>0) {
		 if((año%4==0) && (año%100!=0 || (año%100==0 && año%400==0)))
			 System.out.println( año + "es bisiesto");
		
		else
			System.out.println( año + "no es bisiesto");
		}
}
}