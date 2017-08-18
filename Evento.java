/**
    * Modela las caracteristicas principales para poder realizar y promocionar un evento 
    * 
    
    @author María Fernanda López, Francisco Molina, Paolo Suchini 
    @version 11/08/2017
    
*/

public class Evento{
	//Atributos 
	private String nombre;
	private String tipo;
	private String lugar;
	private String descripcion; 
	private String horario; 

	//Constructor 
	public Evento(String nombre, String tipo, String lugar, String descripcion, String horario){
		this.nombre = nombre;
		this.tipo = tipo;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.horario = horario;
	}

	//gets 

	public String getNombre(){
		return nombre;
	}

	public String getTipo(){
		return tipo;
	}

	public String getLugar(){
		return lugar;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public String getHorario(){
		return horario;
	}

}