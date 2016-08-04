//Importación de librería para poder leer
//caracteres desde el teclado
import java.util.Scanner;

public class EjemploIFSimple {
	public static void main(String args[]) {
		//Declaración para poder leer los caractéres
		//por el teclado.
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un número entero: ");
		int numeroLeido = in.nextInt();
		
		if (numeroLeido %2 == 0) 
			System.out.println("El número " + numeroLeido + " es par");
		else
			System.out.println("El número " + numeroLeido + " es impar");
	}
}
