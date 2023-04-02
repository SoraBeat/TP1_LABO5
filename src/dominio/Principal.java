package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

import clases.ActorPrincipal;
import clases.Banda;
import clases.Deporte;
import clases.Entrada;
import clases.EntradaDeportiva;
import clases.EntradaInfantil;
import clases.EntradaRecital;
import clases.EntradaTeatro;
import clases.Teatro;

public class Principal {

	public static void main(String[] args) {
		//Instanciar objetos las cuales vayamos a utilizar
		
		//DEPORTE 
		Deporte[] deporte = new Deporte[2];
		deporte[0] = new Deporte("Futbol", true);
		deporte[1] = new Deporte("Hockey", false);
		
		Entrada[] eDeporte = new EntradaDeportiva[2];
		eDeporte[0] = new EntradaDeportiva("Super clasico", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 120, deporte[0]);
		eDeporte[1] = new EntradaDeportiva("Hockey internacional!", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 60, deporte[1]);
		
		
		//TEATRO
		
		ActorPrincipal[] actores=new ActorPrincipal[3];
		actores[0]=new ActorPrincipal("Ricardo","Darin");	
		actores[1]=new ActorPrincipal("Leo","Sbaraglia");
		actores[2]=new ActorPrincipal("Gullermo","Franchella");

		Teatro teatro1=new Teatro("Gran Rex","Comedia",actores);
		
		Entrada entradaTeatro1 = new EntradaTeatro("Casados con Hijos", LocalDate.of(2023, 3, 30),LocalTime.of(18, 30),45,teatro1);

		//RECITAL
		
		Banda BandaRHCP = new Banda("Red Hot Chili Peppers","Rock");
		
		Banda[] bandasSoporte = new Banda[2];
		bandasSoporte[0] = new Banda("Red Hot Chili Peppers","Rock");
		bandasSoporte[1] = new Banda("Don Omar","Reggaeton");

		
		Entrada[] eRecital = new EntradaRecital[2];
		eRecital[0]= new EntradaRecital("Clasicos de los 2000", LocalDate.of(2023, 3, 30),LocalTime.of(18, 30), 60, BandaRHCP, true, bandasSoporte);
		eRecital[1]= new EntradaRecital("Clasicos de los 2000", LocalDate.of(2023, 3, 30),LocalTime.of(18, 30), 60, BandaRHCP, false, bandasSoporte);
		
		
		//Creacion de entradas y calculo de precio
		
		//INFANTIL
		
		Entrada[] eInfantil = new EntradaInfantil[2];
		
		eInfantil[0] = new EntradaInfantil("Disney", LocalDate.of(2023, 3, 28),LocalTime.of(18, 30), 80, false, false);
		eInfantil[1] = new EntradaInfantil("Cartoon Network", LocalDate.of(2023, 5, 28),LocalTime.of(14, 30), 80, true, true);

		
		
		// Mostrar por consola resutlados
		for (Entrada entrada: eDeporte) {
			System.out.println(entrada.toString());
		}
		
		for (Entrada entrada: eRecital) {
			System.out.println(entrada.toString());
		}
		
		for (Entrada entrada: eInfantil) {
			System.out.println(entrada.toString());
		}
		
		System.out.println(entradaTeatro1.toString());
	}

}
