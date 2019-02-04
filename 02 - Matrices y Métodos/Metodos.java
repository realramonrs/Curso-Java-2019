package sintaxis;

public class Metodos {

	static void saludar() {
		System.out.println("Hola Mundo");
	}
	
	static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	static void escribir(int mensaje) {
		System.out.println(mensaje);
	}
	
	static int sumar(int x , int y) {
		return x + y;
	}
	
	//Parametros opcionales
	static int sumar(int...x) {
		int suma = 0;
		for(int numero:x) {
			suma+=numero;
		}
		return suma;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escribir(sumar(3,4));
		
	}

}
