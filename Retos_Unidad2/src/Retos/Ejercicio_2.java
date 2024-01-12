package Retos;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. A continuación, muestra los primeros 20 números sucesivos a dicho número.
	
		Scanner scanner=new Scanner(System.in);//Sirve para leer lo que introducimos por máquina.
			System.out.print("Introduce un número: ");//Imprime por pantalla el mensaje para que el usuario siga las instrucciones.
		int numero = scanner.nextInt();//Esto hace que se lea el número introducido en la pantalla.
			System.out.println("Número introducido: " + numero);//Nos imprime el número que el usuario a introducido por pantalla.
			
		if(numero <0) {//Utilizamos el if para comprobar que el número sea positivo.

			while (numero<0) {//Utilizamos el while para que nos repita el bucle hasta que sea positivo.
				System.out.println("El número introducido no es correcto tiene que ser positivo.");
				System.out.println("Introduzca un número de nuevo.");//Ambos mensajes le saldrán al usuario al introducir el número incorrecto.
				numero = scanner.nextInt();//Leerá nuevamente el nuevo número introducido por el usuario.
				}
		}
	
		System.out.println("El número es correcto.");//Imprimirá por pantalla estos dos mensajes cuando el número sea correcto.
		System.out.println("A continuación le mostraré los 20 números sucesivos..");

		
		for (int i=1; i<=20; i++) {//Utilizamos for para que nos sume en 1 el número que el usuario le haya introducido hasta 20 veces.
			System.out.println(numero + i);//Imprime por pantalla los 20 números consecutivos del número introducido por el usuario.
		}
        
		scanner.close();//Cerramos scanner.
			
	}

}
