/**
    * Modela las caracteristicas principales para poder un lugar turistico 
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 13/09/2017
    
*/

public class LugarT{
	//Atributos 
	private String nombre;
	private String descripcion; 
	private String horario; 
	private String departamento;

	//Constructor 
	public LugarT(String nombre, String descripcion, String horario, String departamento){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horario = horario;
		this.departamento=departamento;
	}

	//gets 

	public String getNombre(){
		return nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public String getHorario(){
		return horario;
	}
	
	public String getDepartamento(){
		return departamento;
	}
	
	

}
