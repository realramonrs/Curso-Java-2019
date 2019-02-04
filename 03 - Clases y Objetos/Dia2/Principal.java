package poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		Alumno a1 = new Alumno("12345678R");
		Alumno a2 = new Alumno("12345678W","Yeray","Lorenzo",19);
		Alumno a3 = new Alumno("adasd"),a4 = new Alumno("12341"),a5 = new Alumno("12341234");
		
		a3.nombre = "Marcos";
		a3.edad = 89;
		
		a3 = new Alumno("1324123R");
		
		System.out.println(a1.getDNI());
		
		String apellidos = a1.apellidos;
		
	}

}
