//Calculadora basica en Java

import java.util.Scanner;

class Calculadora
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int opcionLeida;
		double operando1, operando2, resultado;
		
		resultado = 0;
		
		while (true) {
			
			do {
				System.out.println("=== Calculadora simple en Java ===");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir");
				System.out.println("5. Salir");
				System.out.print("Seleccione la operacion deseada: ");
				opcionLeida = in.nextInt();
			} while (opcionLeida < 1 || opcionLeida > 5); 
					
			if(opcionLeida!=5) {
				System.out.println("Ingrese operando 1: ");
				operando1 = in.nextDouble();
				System.out.println("Ingrese operando 2: ");
				operando2 = in.nextDouble();
				
				if (opcionLeida == 1)
					resultado = operando1 + operando2;
				else if(opcionLeida == 2 )
					resultado = operando1 - operando2;
				else if(opcionLeida == 3 )
					resultado = operando1 * operando2;
				else if(opcionLeida == 4 )
					resultado = operando1 / operando2;
				System.out.println("Resultado: " + resultado);
			} else {
				//Salimos del ciclo while(true)
				break;
			}
		} 
	} 
}


