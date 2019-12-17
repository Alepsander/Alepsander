import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// Definición de variables
		double valorCaja = 0;
		boolean valorCorrecto = false;
		boolean continuar = true;
		int opcionMenu = 0;
		double cantidad=0;

		// Definición de objeto de tipo Scanner para la captura de entrada por teclado
		Scanner sc = new Scanner(System.in);

		// Introducción de valores por el usuario

		// Valor inicial de la caja
		do {
			System.out.println("Indica un valor inicial para la caja");
			if (sc.hasNextDouble()) {
				valorCaja = sc.nextDouble();// Tomamos el valor del buffer
				if (valorCaja > 0)
					valorCorrecto = true;
				else
					valorCorrecto = false;

			} else {
				sc.next();// Liberamos el valor incorrecto del buffer
				valorCorrecto = false;
			}
		} while (!valorCorrecto);

		// Bucle menú
		while (continuar) {
			do {// Bucle inserción opción menu
				System.out.printf("Indica una opción:\n");
				System.out.printf("\t1:\tRealizar un ingreso\n");
				System.out.printf("\t2:\tRealizar una sustracción\n");
				System.out.printf("\t0:\tSalir\n");	
				if (sc.hasNextInt()) {
					opcionMenu = sc.nextInt();// Tomamos el valor del buffer
					if (opcionMenu == 1 || opcionMenu == 2 || opcionMenu == 0)
						valorCorrecto = true;
					else
						valorCorrecto = false;

				} else {
					sc.next();// Liberamos el valor incorrecto del buffer
					valorCorrecto = false;
				}
			} while (!valorCorrecto);// Fin bucle inserción opción menu

			switch (opcionMenu) {
			case 1:// inserción
				
				do {// Bucle obtencion cantidad ingresar 
					System.out.printf("Indica el valor a ingresar:\n");
					if (sc.hasNextDouble()) {
						cantidad = sc.nextDouble();// Tomamos el valor del buffer
						if (cantidad>0)
							valorCorrecto = true;
						else
						{
							System.out.printf("El valor a ingresar ha de ser positivo\n",valorCaja);
							valorCorrecto = false;
						}

					} else {
						sc.next();// Liberamos el valor incorrecto del buffer
						valorCorrecto = false;
					}
				} while (!valorCorrecto);// Fin bucle obtencion cantidad insertar
				
				valorCaja=valorCaja+cantidad;
				
				
				break;
			case 2:
				
				do {// Bucle obtencion cantidad retirar
					System.out.printf("Indica el valor a retirar:\n");
					if (sc.hasNextDouble()) {
						cantidad = sc.nextDouble();// Tomamos el valor del buffer
						if (cantidad>0)
						{
							if(valorCaja>=cantidad)	
							{
								valorCorrecto = true;
								valorCaja=valorCaja-cantidad;
							}
							else
							{
								System.out.printf("El valor a retirar no puede ser mayor al restante de la caja (%f)\n",valorCaja);
								valorCorrecto = false;
							}
						}
						else
						{
							System.out.printf("El valor a retirar ha de ser positivo\n",valorCaja);
							valorCorrecto = false;
						}
					} else {
						sc.next();// Liberamos el valor incorrecto del buffer
						valorCorrecto = false;
					}
				} while (!valorCorrecto);// Fin bucle obtencion cantidad retirar
				
				break;

			case 0:
				continuar = false;
				break;
			}

		} // while continuar
		
		
		System.out.printf("El valor final de la caja es %f",valorCaja);

		sc.close();
	}// main

}// class