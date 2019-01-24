import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon RS
 *
 */
public class Bucles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TIpos de bucles en java
		//while
		int i = 2;
		int n = 7;
		int contador = 0;
		while(i<n) {
			
			if(n % i == 0) {
				
				contador++;
				break;
			}
			
			i++;
		} //Fin del bucle while
		
		if(contador==0) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		
		//Bucle for
		
		for(int j = 0;j<10;j++) {
			if(j%2 ==0) {
				System.out.println(j);
			}
		}
		
		//do while
		
		Scanner lector = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduce un numero positivo:");
			numero = lector.nextInt();
		}
		while(numero<0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
