package clases;


public class Teatro implements IValidacion{
	private String nombre;
    private String genero;
	private ActorPrincipal[] actoresPrincipales=new ActorPrincipal[3];
    
	public Teatro(String nombre, String genero, ActorPrincipal[] actoresPrincipales) {
	    this.nombre=nombre;
	    this.genero=genero;
	    Validacion(actoresPrincipales);
	    this.actoresPrincipales=actoresPrincipales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ActorPrincipal[] getActoresPrincipales() {
		return actoresPrincipales;
	}
	public void setActoresPrincipales(ActorPrincipal[] actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}
	@Override
	public String toString() {
		String listadoActores=" Lista de Actores:";
		for (int x=0; x < actoresPrincipales.length; x++) {
			   listadoActores+=" Actor "+(x+1)+actoresPrincipales[x].toString();
			  }
		
		return " Nombre Teatro: "+nombre+ " Genero : " + genero + listadoActores;
	}
	@Override
	public void Validacion(Object[] aArray){
		if(aArray.length > 3) {
		throw new IllegalArgumentException("Un teatro puede tener hasta 3 actores principales.");}
	}



}
