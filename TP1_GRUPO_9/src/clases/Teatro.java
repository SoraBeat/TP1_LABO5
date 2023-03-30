package clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import clases.Actores;
import clases.Entrada;

public class Teatro extends Entrada {

	// Variables
	private double CostoFinal;
	private String genero;
	Actores[] actores = new Actores[3];

	// Constructor
	public Teatro(String genero,String NombreShow, LocalDate fecha, LocalTime hora, int duracion,Actores[] act) {
		super(NombreShow,fecha, hora, duracion);
		calcularPrecio();
		this.genero = genero;
		this.actores = act;
	}

	// Gets and Sets
	public double getCostoFinal() {
		return CostoFinal;
	}

	public String getGenero() {
		return genero;
	}

	public Actores[] getActores() {
		return actores;
	}

	public void setCostoFinal(double costo) {
		this.CostoFinal = costo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setActores(Actores[] actores) {
		this.actores = actores;
	}
	
	@Override
	public void calcularPrecio() {
		CostoFinal =  1350.50;
		
	}

	// ToString1
	@Override
	public String toString() {
		String act = "" ;
		int n=0;
		for (Actores actores2 : actores) {
			n++;
			act +="Principal "+n+":"+actores2.toString();
		}
		
		return "Teatro: "+super.toString()+ "Costo Final=" + CostoFinal + ", genero=" + genero +", actores:\n" +act;
	}



}
