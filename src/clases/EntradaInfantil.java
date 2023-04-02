package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class EntradaInfantil extends Entrada{
	private boolean esMenorDe8;
    private boolean incluyeSouvenir;
    
    public EntradaInfantil(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, boolean esMenorDe8, boolean incluyeSouvenir) {
        super(nombreShow, fecha, hora, duracion);
        this.esMenorDe8 = esMenorDe8;
        this.incluyeSouvenir = incluyeSouvenir;
        this.setCostoFinal(this.calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return esMenorDe8 ? 250 : 500;
    }
    
    public String toString() {
		return "EntradaInfantil: "+super.toString()+". Es menor de 8: "+ (esMenorDe8 ? "Si" : "No") + ". Incluye souvenir :" + (incluyeSouvenir ? "Si" : "No") ;
	}

	public boolean isEsMenorDe8() {
		return esMenorDe8;
	}

	public void setEsMenorDe8(boolean esMenorDe8) {
		this.esMenorDe8 = esMenorDe8;
	}

	public boolean isIncluyeSouvenir() {
		return incluyeSouvenir;
	}

	public void setIncluyeSouvenir(boolean incluyeSouvenir) {
		this.incluyeSouvenir = incluyeSouvenir;
	}

}
