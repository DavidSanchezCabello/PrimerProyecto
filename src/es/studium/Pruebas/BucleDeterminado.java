package es.studium.Pruebas;

import java.util.Scanner;

public class BucleDeterminado
{

	public static void main(String[] args)
	{
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un número");
		numero=teclado.nextInt();
		
		
		for (int i=0;i<=3;i++) {
			
			System.out.println("HOLA"+" "+numero);
			numero+=1;
		}
		teclado.close();

	}

}
