/*6. Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor 
que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
número es par" o "el número es impar". Deberá utilizar el operador “módulo” es el caracter
%.*/

package thp_Tp1;

import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese un número mayor a 0");
		
		int num1=entrada.nextInt();
		
		int operacion=(num1%2);
		
		if (operacion==0) {
			
			System.out.println("El número es par");
			
		}
		else if (operacion==1) {
			
			System.out.println("El número es impar");
			
		}
		

	}

}
