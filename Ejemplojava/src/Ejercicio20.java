import java.util.Scanner;

/*
 * Realizar un diagrama de flujo de un programa que lea por pantalla la nómina
bruta mensual de 3 empleados y, dado que los empleados tienen 14 pagas
anuales y se les realiza una retención del 12% en 12 de esas pagas, mostrar
por pantalla tanto la nómina anual bruta como la nómina anual neta.
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		// Definición de variables
		int nominaBrMens = 0;
		boolean valorCorrecto = false;
		int numEmpleados = 3;
		int numPagas = 14;
		int numPagasRetencion = 12;
		double porcRetencion = 0.12;
		int nominaBrAnual = 0;
		double nominaNetaAnual = 0;

		// Definición de objeto de tipo Scanner para la captura de entrada por teclado
		Scanner sc = new Scanner(System.in);

		// Introducción de valores por el usuario

		int i = 0;
		while (i < numEmpleados) {
			// reiniciamos los valores para cada empleado
			valorCorrecto = false;
			nominaBrAnual = 0;
			nominaNetaAnual = 0;

			while (!valorCorrecto)// Petición de la base
			{
				System.out.printf("Indica un valor para la nómina del empleado %d ", i);
				if (sc.hasNextInt()) {
					nominaBrMens = sc.nextInt();// Tomamos el valor del buffer
					if (nominaBrMens > 0)
						valorCorrecto = true;
					else
						valorCorrecto = false;

				} else {
					sc.next();// Liberamos el valor incorrecto del buffer
					valorCorrecto = false;
				}
			} // while peticion base

			// A partir de aquí tenemos una nómina bruta correcta para el empleado

			double nominaNetaMensual;

			for (int j = 0; j < numPagas; j++)// Bucle pagas
			{
				if (j < numPagasRetencion)
					nominaNetaMensual = nominaBrMens - (nominaBrMens * porcRetencion);
				else
					nominaNetaMensual = nominaBrMens;

				nominaNetaAnual = nominaNetaAnual + nominaNetaMensual;
				nominaBrAnual = nominaBrAnual + nominaBrMens;
			} // Fin bucle pagas

			// Imprimimos el resultado del empleado
			System.out.printf("Resultados del empleado %d\n", i);
			System.out.printf("Nomina bruta anual:\t%d\n", nominaBrAnual);
			System.out.printf("Nomina neta anual:\t%f\n", nominaNetaAnual);

			i++;// Incremento de vble de control de bucle de empleados

		} // while numEmleados

		sc.close();

	}// main

}//class