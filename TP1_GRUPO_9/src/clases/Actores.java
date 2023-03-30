package clases;

public class Actores {
	private String Nombre;
	private String Apellido;
	private int edad;
	
	public Actores(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad+"\n";
	}

}
