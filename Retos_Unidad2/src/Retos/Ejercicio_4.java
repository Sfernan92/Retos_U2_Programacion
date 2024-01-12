package Retos;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa en Java que pida al usuario 3 números y un orden de
		// ordenamiento, que puede ser ascendente o descendente, a continuación, según
		// el orden indicado se mostrarán en pantalla dichos números.

		Scanner scanner = new Scanner(System.in);// Sirve para leer lo que introducimos por máquina.
		System.out.print("Introduce un número: ");// Imprime por pantalla el mensaje para que el usuario siga las
													// instrucciones.
		int numero = scanner.nextInt();// Esto hace que se lea el número introducido en la pantalla.
		System.out.println("Número introducido: " + numero);// Nos imprime el número que el usuario a introducido por
															// pantalla.

		Scanner scanner2 = new Scanner(System.in);// Sirve para leer lo que introducimos por máquina.
		System.out.print("Introduce un número: ");// Imprime por pantalla el mensaje para que el usuario siga las
													// instrucciones.
		int numero2 = scanner.nextInt();// Esto hace que se lea el número introducido en la pantalla.
		System.out.println("Número introducido: " + numero2);// Nos imprime el número que el usuario a introducido por
																// pantalla.

		Scanner scanner3 = new Scanner(System.in);// Sirve para leer lo que introducimos por máquina.
		System.out.print("Introduce un número: ");// Imprime por pantalla el mensaje para que el usuario siga las
													// instrucciones.
		int numero3 = scanner.nextInt();// Esto hace que se lea el número introducido en la pantalla.
		System.out.println("Número introducido: " + numero3);// Nos imprime el número que el usuario a introducido por
																// pantalla.

		System.out.println("Los numeros introducidos han sido: en primer lugar el " + numero + ", en segundo lugar el " + numero2 + ", y en tercer lugar el "+numero3 + ".");
		System.out.println("Dime como quieres ordearlo, pulsa '1' para ascendente o '2' para descendente..");
		Scanner scanner4 = new Scanner(System.in);
		int numero4 = scanner.nextInt();

		int aux=0;

		if (numero4 == 1) {
			System.out.println("Vamos a hacer el orden ascendente por que ha introducido un 1.");


			if(numero>numero2) {
				aux=numero;
				numero=numero2;
				numero2=aux;
			}
			if(numero2>numero3) {
				aux=numero2;
				numero2=numero3;
				numero3=aux;
			}
			if(numero>numero2) {
				aux=numero;
				numero=numero2;
				numero2=aux;
			}
			
			System.out.println("El menor es " + numero + ", el mediano es " + numero2 + ", y el mayor es " + numero3 + ".");
			
		}else if (numero4 == 2) {
			System.out.println("Vamos a hacer el orden descendente por que ha introducido un 2.");
			

			if(numero<numero2) {
				aux=numero;
				numero=numero2;
				numero2=aux;
			}
			if(numero2<numero3) {
				aux=numero2;
				numero2=numero3;
				numero3=aux;
			}
			if(numero<numero2) {
				aux=numero;
				numero=numero2;
				numero2=aux;
			}
			
			System.out.println("El mayor es " + numero + ", el mediano es " + numero2 + ", y el menor es " + numero3 + ".");
		} else {
			System.out.println("El número introducido es incorrecto.");
		}

	}

}
