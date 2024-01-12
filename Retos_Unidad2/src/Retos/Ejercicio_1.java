package Retos;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Escribe un programa en Java que muestre los números del 10 al 1, en ese orden. Debes utilizar una estructura de tipo while ó do-while.
		
		int contador=10; //Introducimos el contador para que cuente 10.
		while (contador >=1) //Utilizamos el while para que haga el recorrido inverso contando desde el 10 hasta el 1.
			{ System.out.println(contador); 
			contador--;//Nos imprime por pantalla el recorrido.
			}
	}

}
