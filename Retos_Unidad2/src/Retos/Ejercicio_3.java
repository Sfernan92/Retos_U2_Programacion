package Retos;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. Utiliza las estructuras de control que creas convenientes.

		int contador2=0;
		int contador3=0;
		for (int i = 1; i <= 100; i++) {
			int multi = i % 2;
			int multi2 = i % 3;
			if (multi == 0) {
				System.out.println("el numero " + i + " es multiplo de 2");
				contador2=contador2+1;
			}
			if (multi2 == 0) {
				System.out.println("el numero " + i + " es multiplo de 3");
				contador3=contador3+1;	
			}

		}
		System.out.println("En el rango de 1 a 100 hay " + contador2 + " números que son múltiplos de 2.");
		System.out.println("En el rango de 1 a 100 hay " + contador3 + " números que son múltiplos de 3.");

	}
}