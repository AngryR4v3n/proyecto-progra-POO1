/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Maria Fernanda Lopez 17160, Francisco Molina 17050
 * 
 * 
 */
public class Restaurante {
        private String nombre;
	private String horario;
	private String descripcion;
	private String direccion;
	private String telefono;
        private int c1;
        private int c2;
        private int c3;
        private int c4;
        private int c5;
        private double cal;
	private String departamento;
	
		
	/** 
         * Constructor for objects of class Restaurante
	 * @param nombre: nombre del restaurante
	 * @param horario: horario de atencion
	 * @param descripcion: breve descripcion del restaurante
	 * @param direccion: direccion donde se ubica
	 * @param telefono: telefono de contacto.
	 * @param calificacion: calificacion ingresada por el usuario.
	 */
	public Restaurante(String departamento, String nombre, String horario, String descripcion, String direccion, String telefono,int c1,int c2, int c3, int c4, int c5, double cal) {
		this.nombre=nombre;
		this.horario=horario;
		this.descripcion=descripcion;
		this.direccion=direccion;
		this.telefono=telefono;
		this.c1=c1;
                this.c2=c2;
                this.c3=c3;
                this.c4=c4;
                this.c5=c5;
		this.departamento=departamento;
                this.cal=cal;
	}
        
	/**
         * Metodo para obtener la direccion del restaurante
	 * @return: retorna direccion de restaurante.
	 */
        public void setCalificacion(double val){
            cal=val;
        }
        public double getCalificacion(){
            return cal;
        }
        public int getC1(){            
            return c1;
        }
        public void addC1(){
            c1 +=1;        
        }
        public int getC2(){
            return c2;
        }
        public void addC2(){
            c2 +=1;
        
        }
        public int getC3(){
            return c3;
        }
        public void addC3(){
            c3+=1;
        
        }
        public int getC4(){
            return c4;
        }   
        public void addC4(){
            c4 +=1;
        }
        public int getC5(){
            return c5;
        }
        public void addC5(){
            c5 +=1;
        
        }

        
	public String getDireccion() {
		return direccion;
	}
        
	/**
         * Metodo para obtener el nombre del restaurante
	 * @return: retorna nombre de restaurante.
	 */
	public String getNombre() {
		return nombre;
	}
        
        
	/**
         * Metodo para obtener el horario del restaurante
	 * @return: retorna nombre de restaurante.
	 */
	public String getHorario() {
		return horario;
	}
        
	/**
         * Metodo para obtener la descripcion del restaurante
	 * @return: retorna descripcion del restaurante.
	 */
	public String getDescripcion() {
		return descripcion;
	}
        
	/**
         * Metodo para obtener el telefono del restaurante 
	 * @return: retorna telefono.
	 */
	public String getTel() {
		return telefono;
	}
        
        /**
         * Metodo para obtener el departamento en el que se encuentra el restaurante
         * @return departamento en el que se encuentra el restaurante
         */
	public String getDepa(){
		return departamento;
	}
        
        /**
         * Metodo para obtener toda la informacion del restaurante
         * @return informacion completa del restaurante
         */
	public String toString() {
		String msj = "Nombre: " + getNombre() + " Direccion: " + getDireccion();
		String msj2 ="Telefono " + getTel() + "\nHorario: " + getHorario();
		String descrip= "Descripcion: " + getDescripcion() + "\n";
		String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip;
		return msjCompleto;
	}
        
        /**
         * Metodo para llenar la calificacion del restaurante
         * @param calificacion 
         */

    
}
