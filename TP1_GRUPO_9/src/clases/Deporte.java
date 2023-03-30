package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Deporte extends Entrada{
	private String nombreDeporte;
	private double costoFijo;
	private boolean esInternacional;
	
	//Constructores
	public Deporte() {
		super();
		nombreDeporte="Ninguno";
		costoFijo=0;
		esInternacional=false;
	}
	
	public Deporte(String nombreDeporte, boolean esInternacional,String nombreShow, LocalDate fecha, LocalTime hora, int duracion) {
		super(nombreShow,fecha,hora,duracion);
		this.nombreDeporte = nombreDeporte;
		this.esInternacional = esInternacional;
		this.calcularPrecio();
	}

	//Getters y setters
	public String getNombreDeporte() {
		return nombreDeporte;
	}
	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	public double getCostoFijo() {
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
		public void calcularPrecio() {
	        switch (nombreDeporte.toUpperCase()) {
	            case "FUTBOL":
	            	costoFijo = 300;
	                break;
	            case "RUGBY":
	            	costoFijo  = 450;
	                break;
	            case "HOCKEY":
	            	costoFijo  = 380;
	                break;
	            default:
	                throw new IllegalArgumentException("Deporte no válido");
	        }

	        if (this.esInternacional== true) {
	        	costoFijo  *= 1.3;
	        }
		}

	@Override
	public String toString() {
		return"EntradaDeportiva: "+super.toString()+costoFijo+" "+ " nombreDeporte=" + nombreDeporte + ", esInternacional="
				+ (esInternacional ? "Si" : "No");
	}

}
