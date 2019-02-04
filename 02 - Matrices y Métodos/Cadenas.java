package sintaxis;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cadenas : String y Character
		
		String cadena = "Hola";
		String cadena2 = new String("Hola");
		
		//Funciones
		//substring,startsWith,indexOf,contains,split,charAt
		
		char letra = cadena.charAt(0);
		int posicion = cadena.indexOf('o');
		String subCadena = cadena.substring(0, 3);
		System.out.println(subCadena);
		
		
		//Character
		String dni = "12348r34W";
		
		if(dni.length()!=9) {
			System.out.print("Error numero caracteres");
		}
		else {
			//Verificar 8 primeros digitos
			for(int i = 0;i<8;i++) {
				if(!Character.isDigit(dni.charAt(i))) {
					System.out.println("error en 8 primeros digitos");
					break;
				}
			}
		}
		
		
		//Comparar Strings
		
		String c1 = "Soy una cadena";
		String c2 = "Soy poco intuitivo";
		
		//== o el equals
		
		if(c1.equals(c2)) {
			System.out.println("Iguales");
		}
		else {
			System.out.println("Distintos");
		}
		
		String c3 = "hola";
		String c4 = new String("hola");
		
		boolean condicion = c3==c4;
		System.out.println("operador =  " + c3==c4);
		System.out.println("c3.equals(c4)" + c3.equals(c4));
		
		
		
		
		
		
		
		
		
		
		
	}

}
