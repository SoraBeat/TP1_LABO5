package clases;

public class Deporte {
	private String nombreDeporte;
	private boolean esInternacional;
	
	//Constructores
	public Deporte() {
		super();
		nombreDeporte="Ninguno";
		esInternacional=false;
	}
	public Deporte(String nombreDeporte, boolean esInternacional) {
		super();
		this.nombreDeporte = nombreDeporte;
		this.esInternacional = esInternacional;
	}

	//Getters y setters
	public String getNombreDeporte() {
		return nombreDeporte;
	}
	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	public boolean isEsInternacional() {
		return esInternacional;
	}
	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}
	//Metodos
	@Override
	public String toString() {
		return " nombreDeporte=" + nombreDeporte + ", esInternacional="
				+ (esInternacional ? "Si" : "No");
	}

}
