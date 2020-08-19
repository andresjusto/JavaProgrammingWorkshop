/*4. Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: “La
suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2*/

package thp_Tp1;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese numero 1");
		
		int num1=entrada.nextInt();
		
		System.out.println("Ingrese numero 2");
		
		int num2=entrada.nextInt();
		
		int resultado= (num1+num2);
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + resultado);
		

	}

}
