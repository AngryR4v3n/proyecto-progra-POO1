/**
    * Modela las caracteristicas principales de una actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
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
	
	public String getDepa(){
		return departamento;
	}
        
        public String getHorario(){
            return horario;
        }
        
        public String getDireccion(){
            return direccion;
        }
        
        @Override
        public String toString() {
			String msj = "Nombre: " + getNombre() + "\nDireccion: " + getDireccion();
			String msj2 = "Tipo: " + getTipo() ;
			String descrip= "Horario: " + getHorario();
			String direc = "Departamento: " + getDepa();
			String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip+"\n"+direc;
			return msjCompleto;
		}
}
