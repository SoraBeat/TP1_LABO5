package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import clases.Deporte;
import clases.Entrada;
import clases.EntradaDeportiva;
import clases.EntradaInfantil;

public class Principal {

	public static void main(String[] args) {
		// Creacion de los deportes y sus precios
		Deporte futbolNacional = new Deporte("Futbol", true);
		Deporte hockeyInternacional = new Deporte("Hockey", false);

		// Creacion de entradas deportivas y calculo de precio
		Entrada entradaDeportiva = new EntradaDeportiva("Super clasico", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 120, futbolNacional);
		entradaDeportiva.calcularPrecio();

		Entrada entradaDeportiva2 = new EntradaDeportiva("Hockey internacional!", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 60, hockeyInternacional);
		entradaDeportiva2.calcularPrecio();
		
		Entrada entradaInfantil = new EntradaInfantil("Disney", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 80, false, false);

		// Mostrar por consola resutlados
		System.out.println(entradaDeportiva.toString());
		System.out.println(entradaDeportiva2.toString());
		System.out.println(entradaInfantil.toString());
	}

}
