import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon RS
 *
 */
public class LecturaDatosTeclado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = lector.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
	}

}
