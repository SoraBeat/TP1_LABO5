package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import clases.ActorPrincipal;
import clases.Deporte;
import clases.Entrada;
import clases.EntradaDeportiva;
import clases.EntradaInfantil;
import clases.EntradaTeatro;
import clases.Teatro;

public class Principal {

	public static void main(String[] args) {
		// Creacion de los deportes y sus precios
		Deporte futbolNacional = new Deporte("Futbol", true);
		Deporte hockeyInternacional = new Deporte("Hockey", false);
		
		ActorPrincipal actor1=new ActorPrincipal("Ricardo","Darin");
		ActorPrincipal actor2=new ActorPrincipal("Leo","Sbaraglia");
		ActorPrincipal actor3=new ActorPrincipal("Gullermo","Franchella");
		
		ActorPrincipal[] actores=new ActorPrincipal[3];
		actores[0]=actor1;
		actores[1]=actor2;
		actores[2]=actor3;

		Teatro teatro1=new Teatro("Gran Rex","Comedia",actores);
		
		// Creacion de entradas deportivas y calculo de precio
		Entrada entradaDeportiva = new EntradaDeportiva("Super clasico", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 120, futbolNacional);
		entradaDeportiva.calcularPrecio();

		Entrada entradaDeportiva2 = new EntradaDeportiva("Hockey internacional!", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 60, hockeyInternacional);
		entradaDeportiva2.calcularPrecio();
		
		Entrada entradaInfantil = new EntradaInfantil("Disney", LocalDate.of(2023, 3, 28),
				LocalTime.of(18, 30), 80, false, false);

		Entrada entradaTeatro1 = new EntradaTeatro("Casados con Hijos", LocalDate.of(2023, 3, 30),LocalTime.of(18, 30),45,teatro1);
		// Mostrar por consola resutlados
		System.out.println(entradaDeportiva.toString());
		System.out.println(entradaDeportiva2.toString());
		System.out.println(entradaInfantil.toString());
		System.out.println(entradaTeatro1.toString());
	}

}
