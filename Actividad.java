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
	private String departamento;

	//Constructor
	public Actividad(String nombre, String tipo, String horario, String direccion, String departamento){
		this.nombre=nombre;
		this.tipo=tipo;
		this.horario=horario;
		this.direccion=direccion;
		this.departamento=departamento;
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
	
	public String getDepa(){
		return departamento;
	}
}
