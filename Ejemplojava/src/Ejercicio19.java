import java.util.Scanner;

public class Ejercicio19 {

	public static void main (String[] args) {
		int alumnos=6;
		int asignaturas=3;
		int nota=0;
		int contAsign=1;
		
		Scanner sc= new Scanner(System.in);
		
		if (contAsign>asignaturas);
		contAsign=contAsign+1;
		int contAlumn = 1;
		int alumnosAsig = 0;
		int mediaAsig = 0;
		int numSobrAsig = 0;
		int numSuspAsig = 0;
		int numAprAsig = 0;
		int numNotAsig = 0;
		int sumNotasAsig = 0;
		
			if (contAlumn<=alumnos) {
			contAlumn=contAlumn + 1;
			System.out.println("Introduce la nota de la asignatura" + contAsign + "y alumno" + contAlumn);
			if(sc.hasNextInt()){
				
			nota = sc.nextInt();
				if (nota==-1);
				sc.close();
			}
				else
					if (nota<5) {
					numSuspAsig=numSuspAsig + 1;
					}
					else
						if (nota<7) {
						numAprAsig=numAprAsig + 1;
						}
						else 
							if (nota<9) {
							numNotAsig=numNotAsig + 1;
							}
							else
								numSobrAsig=numSobrAsig + 1;}
			
			else 
				mediaAsig=sumNotasAsig/alumnosAsig;
				
				System.out.println("En la asignatura" + contAsign + "se han presentado" + alumnosAsig + "alumnos");
				System.out.println("La media de la asignatura es" + mediaAsig);
				System.out.println("El número de suspensos es" + numSuspAsig);
				System.out.println("El número de aprobados es" + numAprAsig);
				System.out.println("El número de notables es" + numNotAsig);
				System.out.println("El número de sobresalientes es" + numSobrAsig);
			}	
	}

