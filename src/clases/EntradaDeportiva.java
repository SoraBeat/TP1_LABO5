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

	public EntradaDeportiva(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, Deporte deporte) {
		super(nombreShow, fecha, hora, duracion);
		this.deporte = deporte;
		this.setCostoFinal(this.calcularPrecio());
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
		/*float costo = deporte.getCostoFijo();
		if (deporte.isEsInternacional()) {
			costo += costo * 0.3;
		}
		super.setCostoFinal(costo);
		return costo;*/
		float costoBase;

        switch (deporte.getNombreDeporte().toUpperCase()) {
            case "FUTBOL":
                costoBase = 300;
                break;
            case "RUGBY":
                costoBase = 450;
                break;
            case "HOCKEY":
                costoBase = 380;
                break;
            default:
                throw new IllegalArgumentException("Deporte no válido");
        }

        if (deporte.isEsInternacional() == true) {
            costoBase *= 1.3;
        }

        return costoBase;
	}

	@Override
	public String toString() {
		return "EntradaDeportiva: "+super.toString()+" "+deporte.toString();
	}
	
}
