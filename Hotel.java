/**
 * Esta clase permite la creación de objetos de tipo hotel
	*/
public class Hotel {
	
		private String nombre;
		private String correo;
		private String horario;
		private String descripcion;
		private String direccion;
		private String telefono;
		private double calificacion;
		private String departamento;
		
		/**
		 * El constructor de objetos de tipo Hotel con valores nulos.
		 */
		
		public Hotel() {
			nombre="";
			correo="";
			horario="";
			descripcion="";
			direccion="";
			telefono="";
			calificacion=0.0;
			departamento="";
		}
		
		/** Constructor de hoteles bajo determinados parametros
		 * 
		 * 
		 * @param nombre: nombre del hotel
		 * @param horario: horario de atencion
		 * @param descripcion: breve descripcion del hotel
		 * @param direccion: direccion donde se ubica
		 * @param telefono: telefono de contacto.
		 * @param calificacion: calificacion ingresada por el usuario.
		 */
		public Hotel(String nombre, String correo, String horario, String descripcion, String direccion, String telefono, double calificacion, String departamento) {
			this.nombre=nombre;
			this.correo=correo;
			this.horario=horario;
			this.descripcion=descripcion;
			this.direccion=direccion;
			this.telefono=telefono;
			this.calificacion=calificacion;
			this.departamento=departamento;
		}
		/**
		 * @return: retorna nombre de hotel.
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @return: retorna calificacion de hotel.
		 */
		public double getCalificacion() {
			return calificacion;
		}
		/**
		 * @return: retorna nombre de hotel.
		 */
		public String getHorario() {
			return horario;
		}
		/**
		 * @return: retorna correo de hotel.
		 */
		public String getCorreo() {
			return correo;
		}
		/**
		 * @return: retorna descripcion del hotel.
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
		/**
		 * @return: retorna direccion.
		 */
		public String getDireccion() {
			return direccion;
		}
		public String getDepartamento(){
			return departamento;
		}
		/**
		 * @return retorna todos los datos del objeto en un string.
		 */
		public String toString() {
			String msj = "Nombre: " + getNombre() + " Direccion: " + getDireccion();
			String msj2 = "Correo: " + getCorreo() + " Telefono " + getTel();
			String descrip= "Descripcion: " + getDescripcion();
			String direc = "Departamento: " + getDepartamento();
			String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip+"\n"+direc;
			return msjCompleto;
		}
		public void setCalificacion(double calificacion) {
			this.calificacion=calificacion;
		}

}
