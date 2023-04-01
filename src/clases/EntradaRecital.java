package clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class EntradaRecital extends Entrada {
	private Banda bandaPrincipal;
	private Boolean esVip;
	private Banda bandasSoporte[];

	// Constructores
	public EntradaRecital(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, Banda bandaPrincipal,
			Boolean esVip, Banda[] bandasSoporte) {
		super(nombreShow, fecha, hora, duracion);
		this.bandaPrincipal = bandaPrincipal;
		this.esVip = esVip;
		if(bandasSoporte.length > 2) throw new IllegalArgumentException("Puede haber hasta 2 bandas de soporte");
		this.bandasSoporte = bandasSoporte;
		this.setCostoFinal(calcularPrecio());
	}

	public EntradaRecital() {
		super();
		this.bandaPrincipal = new Banda();
		this.esVip = false;
		this.bandasSoporte = new Banda[2];
		this.setCostoFinal(calcularPrecio());
	}

	// Getters y Setters
	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}

	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public Boolean getEsVip() {
		return esVip;
	}

	public void setEsVip(Boolean esVip) {
		this.esVip = esVip;
	}

	public Banda[] getBandasSoporte() {
		return bandasSoporte;
	}

	public void setBandasSoporte(Banda[] bandasSoporte) {
		this.bandasSoporte = bandasSoporte;
	}

	// Metodos
	@Override
	public String toString() {
		return "EntradaRecital: "+super.toString()+" bandaPrincipal=" + bandaPrincipal + ", esVip=" + esVip + ", bandasSoporte="
				+ Arrays.toString(bandasSoporte) + "]";
	}
	
	@Override
	public float calcularPrecio() {
		return this.esVip ?  1500 : 800;
	}

}
