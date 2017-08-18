/**
    * Modela las caracteristicas principales de una actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina, Paolo Suchini 
    @version 11/08/2017
    
*/

public class Actividad{
	//Atributos
	private String nombre;
	private String tipo;
	private String horario;
	private String direccion; 

	//Constructor
	public Actividad(String nombre, String tipo, String horario, String direccion){
		this.nombre=nombre;
		this.tipo=tipo;
		this.horario=horario;
		this.direccion=direccion;
	}

	//gets
	public String getNombre(){
		return nombre;
	}

	public String getTipo(){
		return tipo;
	}

	public String getNombre(){
		return nombre;
	}
}