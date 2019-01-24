import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ramon RS
 *
 */
public class StringsyWrappers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Esto es una cadena";
		
		//Wrappers : Por cada variable primitiva de java , existe un wrapper o envoltorio
		//que permite tratarla como si fuera un objeto , esto añdiendole algunas funcionalidades nuevas
		
		//int --> Integer
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		if(edad < 18) {
			System.out.println("Menor de edad");
		}
		
		String numero = "23.4";
		float numeroF = Float.parseFloat(numero);
		
		//Pasar una variable numerica a un String
		
		int x = 23;
		String xCadena = Integer.toString(x);
		
		String xBinario = Integer.toBinaryString(x);
		
		
		String hexadecimal = Integer.toHexString(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
