package es.studium.Pruebas;

import java.util.Scanner;

public class BucleIndeterminado
{

	public static void main(String[] args)
	{
		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		/*
		 * while (numero!=1) {
		 * 
		 * System.out.println("introduzca un n�mero"); numero=teclado.nextInt();
		 * System.out.println("El n�mero introducido es: "+numero); }
		 * System.out.println("Adi�s"); teclado.close();
		 */

		/*do
		{
			System.out.println("Escribir un n�mero");
			numero = teclado.nextInt();
			System.out.println("El n�mero introducido es: " + numero);

		} while (numero != 0);
		System.out.println("Adi�s");*/
		/*System.out.println("Escribir un n�mero");
		numero = teclado.nextInt();
		
		while (numero!=0) {
			System.out.println("No es un cero");
			System.out.println();
			System.out.println("Escribir un n�mero");
			numero = teclado.nextInt();
			System.out.println(numero);
			System.out.println();
		}
		System.out.println("Adi�s");*/
		do {
			System.out.println("Escribir un n�mero");
			numero = teclado.nextInt();
			
			if(numero!=0) {
				System.out.println("No es un cero");
				System.out.println();
			}
		}while (numero!=0);
		System.out.println("Adi�s");
		teclado.close();
	}

}
