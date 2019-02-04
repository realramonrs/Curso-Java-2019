package poo;

public class Alumno {

	private String dni;
	String nombre;
	String apellidos;
	int edad;
	double notaMedia;
	
	//Constructor
	public Alumno(String dni) {
		setDNI(dni);
	}
	
	public Alumno(String dni,String nombre,String apellidos,int edad) {
		setDNI(dni);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	//Métodos de acceso: set(escribir) y get(leer)
	public void setDNI(String dni) {
		if(dni.length()==9) {
			this.dni = dni;
		}
		else {
			System.out.println("No correcto");
		}
	}
	
	public String getDNI() {
		return this.dni;
	}
	
	
}
