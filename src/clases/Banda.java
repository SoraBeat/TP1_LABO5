package clases;

public class Banda {
	private String nombreBanda;
	private String genero;

	// Constructores
	public Banda(String nombreBanda, String genero) {
		super();
		this.nombreBanda = nombreBanda;
		this.genero = genero;
	}

	public Banda() {
		super();
		this.nombreBanda = "Ninguno";
		this.genero = "Ninguno";
	}

	// Getters y setters
	public String getNombreBanda() {
		return nombreBanda;
	}

	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Metodos

	@Override
	public String toString() {
		return "[Banda=" + nombreBanda + ", Genero=" + genero + "]";
	}

}
