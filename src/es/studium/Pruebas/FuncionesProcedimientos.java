package es.studium.Pruebas;

import java.util.Scanner;

public class FuncionesProcedimientos
{

	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribir un número");
		a = teclado.nextInt();
		System.out.println("Escribir otro número");
		b = teclado.nextInt();
		

		funSuma(a,b);

		teclado.close();

	}

	/*public static int funSuma(int x, int y)
	{
		int resultado;
		resultado= x+y;
		return resultado;
	}*/
	public static void funSuma(int x, int y) {
		
		System.out.println("La suma de los numeros es: "+(x+y));
		
	}

}
