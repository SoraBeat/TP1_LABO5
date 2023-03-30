package dominio;

import java.time.LocalDate;
import java.time.LocalTime;


public class Principal {
	
	public static void main(String[] args) {
		
		//entrada 1 creada con constructor vacio
		
		LocalTime horaEntrada = LocalTime.of(15, 30);
		LocalDate fechaEntrada = LocalDate.of(2023,3,27);
		Entrada entrada1 = new Entrada();
		
		//entrada 1 cargada con setters
		entrada1.setShow("show medieval");
		entrada1.setFecha(fechaEntrada);
		entrada1.setHora(horaEntrada);
		entrada1.setDuracion(1);
		
		//entrada 1 mostrada con getters
		System.out.println("entrada n°"+entrada1.getId()+" descripcion = "+entrada1.getShow()+" hora = "+entrada1.getHora()+" fecha = "+entrada1.getFecha()+" duracion = "+entrada1.getDuracion());
		
		//entrada 2 creada con metodo crearEntrada
		horaEntrada = LocalTime.of(20, 30);
		fechaEntrada = LocalDate.of(2023,3,25);
		
		Entrada entrada2 = Entrada.crearEntrada("show infantil",fechaEntrada,horaEntrada,2);
		
		//entrada 2 mostrada con toString
		System.out.println(entrada2.toString());
		
		//entrada 3 creada con constructor con parametros
		horaEntrada = LocalTime.of(17, 30);
		fechaEntrada = LocalDate.of(2023,3,30);
		Entrada entrada3 = new Entrada("futbol juvenil 2023",fechaEntrada,horaEntrada,3);
		//entrada 3 mostrada con getters
		System.out.println("entrada n°"+entrada3.getId()+" descripcion = "+entrada3.getShow()+" hora = "+entrada3.getHora()+" fecha = "+entrada3.getFecha()+" duracion = "+entrada3.getDuracion());
	}
	
}
