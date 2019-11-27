package firstProyect;

import java.util.Scanner;

public class Preguntas {

	public static void main(String[] args) {
		int preguntas=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduzca un numero de pregunta");
		preguntas=teclado.nextInt();
		
		switch (preguntas) {
		case 1:
			System.out.println("¿Cuál es la capital de España?");
			break;
		case 2:
			System.out.println("¿De que color es el mar?");
			break;
		case 3:
			System.out.println("¿Cuántas vidas tiene un gato?");
			break;
		case 4:
			System.out.println("¿Cuál es la capital de Francia?");
			break;
		case 5:
			System.out.println("¿Cuál es la capital de Inglaterra?");
			break;
		case 6:
			System.out.println("¿De que color es el cesped?");
			break;
		case 7:
			System.out.println("¿Que equipos son grandes rivales en Sevilla?");
			break;
		case 8:
			System.out.println("¿Que equipos son grandes rivales en Madrid?");
			break;
		case 9:
			System.out.println("¿Quién escribió El Quijote?");
			break;
		case 10:
			System.out.println("¿Cuál es el libro mas famoso de todos los tiempos?");
			break;
			default:
				System.out.println("El número introducido no es correcto");
				break;
		}
		
		
		
		teclado.close();
		
	}
}
