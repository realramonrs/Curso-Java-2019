/**
 * 
 */

/**
 * @author Ramon RS
 *
 */
public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operador + para concatenar texto con variables
		int sueldoMinimo = 900;
		System.out.println("El salario minimo es " + sueldoMinimo + " €");
		
		//Operadores matemáticos: + , - , * , / , %(resto de la division entera)
		int resto = sueldoMinimo%4;
		
		//Otros operadores matematicos: 
		//+= , -= , *= , /=
		sueldoMinimo+=100; //sueldoMinimo = sueldoMinimo + 100
		
		//++ , --
		
		int x = 10;
		x++;
		System.out.println("x vale " + x);
		
		int y = ++x;
		System.out.println("y vale " + y);
		System.out.println("x vale " + x);
		
		
		//Operadores relacionales == ,!=, <,>,<=,>= (Devuelven true o false)
		
		int sueldo = 840;
		boolean sueldoDigno = sueldo > sueldoMinimo;
		
		//Operadores lógicos : && (And) , ||(or) , ! (not)
		
		//Operador condicional
		
		int irpf = sueldo > 800 ? 150 : 90;
		
		//Equivalente a:
		if(sueldo > 800) {
			irpf = 150;
		}
		
		else if(sueldo > 600) {
			irpf = 120;
		}
		else {
			irpf = 90;
			}
		
		//Operador condicional para else if
		int irpf2 = sueldo>800 ? 150 : sueldo > 600 ? 120 : 90;
		
		
	}

}
