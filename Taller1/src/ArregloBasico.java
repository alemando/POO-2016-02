//Operacion basica de arreglo de enteros.
class ArregloBasico
{
  public static void main(String args[])
  {
  
	// Declaracion del arreglo
	int[] arregloEnteros;
	arregloEnteros = new int [20];
	
	//Variable para controlar el indice del arreglo
	int i;
	
	System.out.print("Llenado del arreglo..." + '\n');
	for (i = 0; i < 20; i++) {
		arregloEnteros[i] = i+1;
	}
	
	System.out.println("Mostramos el arreglo...");
	for (i = 0; i < 20; i++) {
		System.out.println("Arreglo en la posicion " + i + " = " + arregloEnteros[i]);
	}
  }
}
