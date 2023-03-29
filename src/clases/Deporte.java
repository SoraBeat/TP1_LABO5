package clases;

public class Deporte {
	private String nombreDeporte;
	private float costoFijo;
	private boolean esInternacional;
	
	//Constructores
	public Deporte() {
		super();
		nombreDeporte="Ninguno";
		costoFijo=0;
		esInternacional=false;
	}
	public Deporte(String nombreDeporte, float costoFijo, boolean esInternacional) {
		super();
		this.nombreDeporte = nombreDeporte;
		this.costoFijo = costoFijo;
		this.esInternacional = esInternacional;
	}

	//Getters y setters
	public String getNombreDeporte() {
		return nombreDeporte;
	}
	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	public float getCostoFijo() {
		return costoFijo;
	}
	public void setCostoFijo(float costoFijo) {
		this.costoFijo = costoFijo;
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
		return " nombreDeporte=" + nombreDeporte + ", costoFijo=" + costoFijo + ", esInternacional="
				+ esInternacional;
	}

}
