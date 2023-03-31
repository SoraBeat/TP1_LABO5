package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class EntradaTeatro extends Entrada {

	private Teatro teatro;
	
	public EntradaTeatro(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, Teatro teatro) {
		super(nombreShow, fecha, hora, duracion);		
		this.teatro=teatro;
	}
	
	public Teatro getTeatro() {
		return teatro;
	}


	public void setTeatro(Teatro teatro) {
		this.teatro = teatro;
	}


	@Override
	public float calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String toString() {
		return "EntradaTeatro: "+super.toString() + teatro.toString();
	}
	

}
