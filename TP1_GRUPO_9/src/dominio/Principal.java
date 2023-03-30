package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import clases.Actores;
import clases.Deporte;
import clases.Entrada;
import clases.EntradaInfantil;
import clases.Teatro;

public class Principal {

	public static void main(String[] args) {
		
		//Deporte
		Entrada dept[] = new Deporte[2];
		
		dept[0] = new Deporte("Futbol", true,"Super clasico", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 120);
		dept[1] = new Deporte("Hockey", false,"Hockey internacional!", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 60);
		
		
		//Entrada infantil
		Entrada ent[] = new EntradaInfantil[2];
		ent[0] = new EntradaInfantil("Disney", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 80, false, false);
		ent[1] = new EntradaInfantil("La bella y la bestia", LocalDate.of(2023, 7, 28),LocalTime.of(14, 30), 80,true, true);

		//Teatro
		Actores[] act = new Actores[3];
		
		act[0] = new Actores("Lucia", "Cavana", 22);
		act[1] = new Actores("Ramiro", "Gonzales",32);
		act[2] = new Actores("Florencia", "Ramirez", 29);
		
		Entrada teatro[] = new Teatro[2];
		teatro[0] = new Teatro("Drama","la sirenita", LocalDate.of(2023, 7, 28),LocalTime.of(14, 30), 80, act);
		teatro[1] = new Teatro("Comedia","Como niños", LocalDate.of(2023, 7, 28),LocalTime.of(14, 30), 80, act);
		
		// Mostrar por consola resutlados
		for (Entrada entrada : dept) {
			System.out.println(entrada);
		}

		for (Entrada entrada : ent) {
			System.out.println(entrada);
		}
		
		for (Entrada entrada : teatro) {
			System.out.println(entrada);
		}
	}

}
