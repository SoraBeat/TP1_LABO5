package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Entrada {
	private static int count = 0;
	private final int id;
	private String nombreShow;
	private LocalDate fecha;
	private LocalTime hora;
	private int duracion;
	private double costoFinal;

	// constructores

	public Entrada() {
		count++;
		id = count;
		nombreShow = "";
		fecha = LocalDate.of(1, 1, 1);
		hora = LocalTime.of(1, 1);
		duracion = 0;
		costoFinal = 0;
	}

	public Entrada(String nombreShow, LocalDate fecha, LocalTime hora, int duracion, double costoFinal) {
		super();
		count++;
		id = count;
		this.nombreShow = nombreShow;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.costoFinal = costoFinal;
	}

	// getters y setters

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Entrada.count = count;
	}

	public int getId() {
		return id;
	}

	public String getNombreShow() {
		return nombreShow;
	}

	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCostoFinal() {
		return costoFinal;
	}

	public void setCostoFinal(float costoFinal) {
		this.costoFinal = costoFinal;
	}

	// metodos

	@Override
	public String toString() {
		return "ID="+id+" nombreShow=" + nombreShow + ", fecha=" + fecha + ", hora=" + hora + ", duracion=" + duracion
				+ ", costoFinal=$" + costoFinal;
	}
	
	public int proximoID() {
		return count+1;
	}
	
	public abstract float calcularPrecio();

}
