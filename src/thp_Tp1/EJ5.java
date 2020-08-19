/*5. Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
teclado por el usuario, muestre el resultado de la división del primero por el segundo
siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
“No se puede dividir por cero”.*/

package thp_Tp1;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese número 1");
		
		int num1=entrada.nextInt();
		
		System.out.println("Ingrese número 2");
		
		int num2=entrada.nextInt();
		
		int result= (num1 / num2);
		
		if (num2 > 0 ) {
			
			System.out.println(num1 + " / " + num2 + " = " + result);
			
		}
		else if (num2 == 0) {
			
			System.out.println("No se puede dividir por cero");
			
		}
				
	}

}
