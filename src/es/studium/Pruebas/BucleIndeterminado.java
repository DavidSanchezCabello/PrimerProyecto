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
		 * System.out.println("introduzca un número"); numero=teclado.nextInt();
		 * System.out.println("El número introducido es: "+numero); }
		 * System.out.println("Adiós"); teclado.close();
		 */

		/*do
		{
			System.out.println("Escribir un número");
			numero = teclado.nextInt();
			System.out.println("El número introducido es: " + numero);

		} while (numero != 0);
		System.out.println("Adiós");*/
		/*System.out.println("Escribir un número");
		numero = teclado.nextInt();
		
		while (numero!=0) {
			System.out.println("No es un cero");
			System.out.println();
			System.out.println("Escribir un número");
			numero = teclado.nextInt();
			System.out.println(numero);
			System.out.println();
		}
		System.out.println("Adiós");*/
		do {
			System.out.println("Escribir un número");
			numero = teclado.nextInt();
			
			if(numero!=0) {
				System.out.println("No es un cero");
				System.out.println();
			}
		}while (numero!=0);
		System.out.println("Adiós");
		teclado.close();
	}

}
