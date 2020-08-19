/*3. Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo.*/
package thp_Tp1;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Por favor, introduce tu nombre ");
		
		String username=entrada.nextLine();
		
		System.out.print("Bienvenido, " + username);
			

	}

}
