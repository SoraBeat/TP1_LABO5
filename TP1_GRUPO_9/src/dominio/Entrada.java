package dominio;

import java.time.LocalTime;
import java.time.LocalDate;

public class Entrada {
 private static int id = 0;
 private String show;
 private LocalDate fecha;
 private LocalTime hora;
 private int duracion;

 
 //constructores
 
 
 
 public Entrada(String show,LocalDate fecha,LocalTime hora, int duracion) {
	 id = id + 1;
	 this.show = show;
	 this.hora = hora;
	 this.fecha = fecha;
	 this.duracion = duracion;
 }
 
 public Entrada() {
	 id = id + 1;
 }
 
//getters y setters


public int getId() {
	return id;
}

public String getShow() {
	return show;
}


public void setShow(String show) {
	this.show = show;
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

//metodos

public static void reiniciarID() {
    id = 0;
}

public static Entrada crearEntrada(String show,LocalDate fecha,LocalTime hora, int duracion) {
    return new Entrada(show, fecha, hora, duracion);
}

@Override
public String toString() {
	return "Entrada [Entrada n° = "+id+",descripcion= " + show + ", fecha= " 
+ fecha + ", hora= " + hora + ", duracion= " + duracion + "]";
}

}
