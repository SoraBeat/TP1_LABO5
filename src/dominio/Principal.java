package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import clases.Deporte;
import clases.Entrada;
import clases.EntradaDeportiva;

public class Principal {

	public static void main(String[] args) {
		// Creacion de los deportes y sus precios
		Deporte futbolNacional = new Deporte("Futbol", 300, false);
		Deporte hockeyInternacional = new Deporte("Hockey", 380, true);

		// Creacion de entradas deportivas y calculo de precio
		Entrada entradaDeportiva = new EntradaDeportiva("Super clasico", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 200, 0.0, futbolNacional);
		entradaDeportiva.calcularPrecio();

		Entrada entradaDeportiva2 = new EntradaDeportiva("Hockey internacional!", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 200, 0.0, hockeyInternacional);
		entradaDeportiva2.calcularPrecio();

		// Mostrar por consola resutlados
		System.out.println(entradaDeportiva.toString());
		System.out.println(entradaDeportiva2.toString());
	}

}
