package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class EntradaDeportiva extends Entrada {
	private Deporte deporte;

	// Constructores
	public EntradaDeportiva() {
		super();
		this.deporte = new Deporte();
	}

	public EntradaDeportiva(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, double costoFinal,
			Deporte deporte) {
		super(nombreShow, fecha, hora, duracion, costoFinal);
		this.deporte = deporte;
	}

	// Getters y setters
	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	// Metodos
	@Override
	public float calcularPrecio() {
		float costo = deporte.getCostoFijo();
		if (deporte.isEsInternacional()) {
			costo += costo * 0.3;
		}
		super.setCostoFinal(costo);
		return costo;
	}

	@Override
	public String toString() {
		return "EntradaDeportiva: "+super.toString()+" "+deporte.toString();
	}
	
}
