/**Esta clase permite la creación de objetos de tipo restaurante
*/
public class Restaurante{
	private String nombre;
	private String horario;
	private String descripcion;
	private String direccion;
	private String telefono;
	private double calificacion;
	
	/**
	 * El constructor de objetos de tipo Restaurante con valores nulos.
	 */
	
	public Restaurante() {
		this.nombre="";
		this.horario="";
		this.descripcion="";
		this.direccion="";
		this.telefono="";
		this.calificacion=0.0;
	}
	
	/** Constructor de restaurantes bajo determinados parametros
	 * 
	 * 
	 * @param nombre: nombre del restaurante
	 * @param horario: horario de atencion
	 * @param descripcion: breve descripcion del restaurante
	 * @param direccion: direccion donde se ubica
	 * @param telefono: telefono de contacto.
	 * @param calificacion: calificacion ingresada por el usuario.
	 */
	public Restaurante(String nombre, String horario, String descripcion, String direccion, String telefono, double calificacion) {
		this.nombre=nombre;
		this.horario=horario;
		this.descripcion=descripcion;
		this.direccion=direccion;
		this.telefono=telefono;
		this.calificacion=calificacion;
	}
	/**
	 * @return: retorna direccion de restaurante.
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @return: retorna nombre de restaurante.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return: retorna calificacion de restaurante.
	 */
	public double getCalificacion() {
		return calificacion;
	}
	/**
	 * @return: retorna nombre de restaurante.
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @return: retorna descripcion del restaurante.
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @return: retorna telefono.
	 */
	public String getTel() {
		return telefono;
	}
	public String toString() {
		String msj = "Nombre: " + getNombre() + " Direccion: " + getDireccion();
		String msj2 ="Telefono " + getTel();
		String descrip= "Descripcion: " + getDescripcion();
		String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip;
		return msjCompleto;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion=calificacion;
	}
}