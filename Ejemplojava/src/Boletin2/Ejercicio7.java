package Boletin2;

public class Ejercicio7 {
	public static void main(String[] args) {
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int E=0;
		int N=0;
		int año=10;
		while (año>0) {
			A=año%19;
			B=año%4;
			C=año%7;
			D=(19*A+24)%30;
			E=(2*B+4*C+6*D+5)%7;
			N=22+D+E;
			año=año-1;
			if (N>31) {
				N=N-31;
				System.out.println("El dia de Pascua cae el " + N + " de Abril ");
			}
			System.out.println("El dia de Pascua cae en " + N);
		}
}
}